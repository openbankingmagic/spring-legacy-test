# ���������Ž� ����

## 1. @Controller
- �ش� ������̼��� Spring-Context�� Controller ��ü�� �������ش�.
- �ش� ������̼��� �ִ� Ŭ������ ����ó�� ã�� �� �ִ� ��ü�̴�.
- �ش� ������̼��� �ִ� Ŭ������ �޼ҵ�� ViewResolver�� �����Ѵ�.

## 2. @RequestMapping
- �ش� ������̼��� ����ó�� ã�ƾ��� URL�� ����ϴ� ���̴�.
- ���� �޼ҵ�� GET,POST,PUT,DELETE �̴�.

## 3. @RequestParam
- �ش� ������̼��� QueryString�� MIME-Type: x-www-form-urlencoded 
�����͸� �޾��ش�.
- request.getParameter() �Լ��� ������ ������ �Ѵ�.(���� ���޴´�)

## 4. @RequestBody
- �ش� ������̼��� raw �����͸� ���� �� ����Ѵ�.
- �ڹ��� BufferedReader�� ����
- Jsp�� request.getReader()�� ����.

## 5. @ResponseBody
- �ش� ������̼��� @Controller Ŭ�������� ViewResolver�� �������� ���ϰ� �Ѵ�.
- raw �����͸� return�� �� ����Ѵ�.
- �ڹ��� BufferedWriter Ȥ�� PrintWriter�� ����.
- Jsp�� out ��ü�� ����.

## 6. @PathVariable
- �ش� ������̼��� �ּ� �н� ����� ����ϰ� ���ش�.
- http://localhost:8080//���ؽ�Ʈ�н�/post/{id}

## 7. jackson-mapper ���̺귯��
- �ش� ���̺귯���� ��û�� json�����͸� java Object�� ��ȯ���ִ� �����̴�.
- ����� java Object�� json �����͸� ��ȯ���ִ� �����̴�.

## 8. Git ����
- git init
- git add .
- git config --global "ssar@nate.com"
- git config --global "ssar"
- git commit -m "������ ���Ž� �׽�Ʈ �Ϸ�"
- git remote add origin http://github.com/codingspecialist/spring-legacy-test.git
- git push origin master

## 9. Git �����
- git add .
- git commit -m "������ ���Ž� �׽�Ʈ �Ϸ� 2"
- git push origin master