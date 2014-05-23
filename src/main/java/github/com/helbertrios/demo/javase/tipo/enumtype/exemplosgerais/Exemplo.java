package github.com.helbertrios.demo.javase.tipo.enumtype.exemplosgerais;

class Exemplo  {
	
	
	public static void main(String[] args) {
		//Title.format("Helbert", "Rios");
		Title.MR.format("Helbert", "Rios");
		//MR.format("Helbert", "Rios");
		//Title.DR dr = new Title.DR("DR. ");
	}

}

enum Title {

	MR("Mr. "), MRS("Mrs. "), MS("Ms. ");
	private String title;

	private Title(String s) {
		title = s;
	}

	public String format(String first, String last) {
		return title + " " + first + " " + last;
	}
}

//enum Title2 extends Title {}