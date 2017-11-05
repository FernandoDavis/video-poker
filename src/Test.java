
public class Test {
	
	public static void main(String[] args){
		
		Deck deck = new Deck();
		System.out.println(deck.toString());
		System.out.println("");
		deck.shuffle();
		System.out.println("The shuffled deck is: \n" + deck.toString() + "\n");
		deck.setHand();
		for(int i = 0; i<5; i++){
			deck.drawCard();
		}
		System.out.print("The removed Cards are: ");
		deck.showHand();
		
		System.out.println("\n");
		System.out.println("The updated deck is: \n" + deck.toString()+"\n");
	}	
}
