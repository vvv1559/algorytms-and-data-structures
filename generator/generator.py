import re
import sys
import util.leetcode as lc
from jinja2 import Environment, FileSystemLoader

ROW_SIZE = 120

OUTPUT_PATH = '../src/main/java/com/leetcode/problems/algorytms'


def create_java_file(url):
    question_content = lc.get_question_content(url)
    difficulty = question_content.get('difficulty').lower()

    env = Environment(loader=FileSystemLoader('.'))
    template = env.get_template('template.jinja2')
    class_name = question_content.get('title').replace(' ', '')

    for snippet in question_content.get('codeSnippets'):
        if snippet.get('langSlug') == 'java':
            parts = {
                'difficulty': difficulty,
                'title': question_content.get('title'),
                'description': cleanup_content(question_content.get('content')),
                'originalLink': url,
                'className': class_name,
                'code': snippet.get('code').replace('Solution', class_name)
            }

            file_content = template.render(parts)
            result_file = "{}/{}/{}.java".format(OUTPUT_PATH, difficulty, class_name)
            with open(result_file, "w+") as f:
                f.write(file_content)


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
