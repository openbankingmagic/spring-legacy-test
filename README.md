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