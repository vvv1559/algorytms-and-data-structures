import json
import requests

_CONTENT_URL = 'https://leetcode.com/graphql'

_QUERY = '''
query questionData($titleSlug: String!) {
    question(titleSlug: $titleSlug) {
        questionId
        title
        titleSlug
        content
        difficulty
        codeSnippets {
          lang
          langSlug
          code
          __typename
        }
      }
}
'''


def get_question_content(url):
    session = requests.Session()
    session.get(url)
    title = url.rsplit('/', 2)[1]

    csrf_token = session.cookies.get('csrftoken')
    payload = {
        "operationName": "questionData",
        "variables": {
            "titleSlug": title
        },
        "query": _QUERY
    }

    headers = {
        'content-type': 'application/json',
        'accept': 'application/json',
        'referer': url,
        'x-csrftoken': csrf_token
    }

    response = session.post(_CONTENT_URL, data=json.dumps(payload), headers=headers)
    if response.status_code != 200:
        raise RuntimeError(response.text)

    return response.json().get('data').get('question')
