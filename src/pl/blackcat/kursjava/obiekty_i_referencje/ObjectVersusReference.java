package pl.blackcat.kursjava.obiekty_i_referencje;

public class ObjectVersusReference {
	public static void main(String[] args) {
		Object referenceToObjectX = new Object();
		Object anotherReferenceToObjectX = referenceToObjectX;
		Object anotherReference = anotherReferenceToObjectX;
		Object refferenceToObjectY = new Object();

		System.out.println(referenceToObjectX.toString());
		System.out.println(anotherReferenceToObjectX.toString());
		System.out.println(anotherReference.toString());
		System.out.println(refferenceToObjectY.toString());
	}
}
