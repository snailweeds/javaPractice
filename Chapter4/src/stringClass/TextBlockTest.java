package stringClass;

public class TextBlockTest {

	public static void main(String[] args) {
//		문자열을 """ """ 사이에 이어서 만들 수 있음
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
