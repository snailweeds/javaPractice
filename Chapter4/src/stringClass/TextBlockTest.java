package stringClass;

public class TextBlockTest {

	public static void main(String[] args) {
//		���ڿ��� """ """ ���̿� �̾ ���� �� ����
		String textBlocks = """
				This
				is
				text
				block
				test.""";
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());

	}

	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span>example text</span>
					</body>
				</html>""";
	}

}
