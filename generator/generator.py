import re
import sys
from pathlib import Path

import util.leetcode as lc
from jinja2 import Environment, FileSystemLoader

ROW_SIZE = 120

_CUR_DIR_ = Path(__file__).parent.resolve()
OUTPUT_PATH = _CUR_DIR_.parent.joinpath('leetcode/src/main/java/com/github/vvv1559/algorithms/leetcode')


def create_java_file(url):
    question_content = lc.get_question_content(url)

    env = Environment(loader=FileSystemLoader(_CUR_DIR_))
    template = env.get_template('template.jinja2')
    class_name = build_class_name(question_content.get('title'))

    for snippet in question_content.get('codeSnippets'):
        if snippet.get('langSlug') == 'java':
            parts = {
                'difficulty': question_content.get('difficulty').lower(),
                'title': question_content.get('title'),
                'description': cleanup_content(question_content.get('content')),
                'originalLink': url,
                'className': class_name,
                'code': snippet.get('code').replace('Solution', class_name)
            }

            file_content = template.render(parts)
            result_file = "{}/{}.java".format(OUTPUT_PATH, class_name)
            with open(result_file, "w+") as f:
                f.write(file_content)


def build_class_name(title):
    parts = [word.capitalize() for word in title.replace('-', ' ').split(' ')]

    if parts[0][0].isdigit():
        parts[0] = '_' + parts[0]

    return ''.join(parts)


def cleanup_content(content):
    content = content.replace('\n', '') \
        .replace('&nbsp;', '') \
        .replace('<p>', '\r') \
        .replace('\r\r', '\r') \
        .replace('\r', '\n')

    content = re.sub('<[^<]+?>', '', content)
    result = []
    for row in content.split('\n'):
        while len(row) > ROW_SIZE:
            part = ''
            last_index = 0
            for word in row.split(' '):
                if len(part) + len(word) + 4 <= ROW_SIZE:
                    part = word if part == '' else (part + ' ' + word)
                else:
                    result.append(' * ' + part)
                    last_index = len(part)
                    break
            row = row[last_index + 1:]

        result.append(' * ' + row)

    return '\n'.join(result)


if __name__ == '__main__':
    url = sys.argv[1]
    create_java_file(url)
