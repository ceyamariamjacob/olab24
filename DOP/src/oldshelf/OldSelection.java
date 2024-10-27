package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		return switch(o){
			case Fiction f-> f.getName();
			case TextBook t-> t.subject();
			case Comic c-> c.getTitle();
			default -> "";
		};
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t=new TextBook("Social Science");
		Comic c=new Comic("Batman", 34);
		Fiction f=new Fiction("Hamlet", FictionType.Tragedy);
		System.out.println(OldSelection.getAgeOrTitle(t));
		System.out.println(OldSelection.getAgeOrTitle(c));
		System.out.println(OldSelection.getAgeOrTitle(f));
		
	}
}
