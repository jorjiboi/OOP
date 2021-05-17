import java.util.LinkedList;

public class Labirint {

	public static void main(String[] args) {
		Poziciq p = new Poziciq(0, 3);
		traektoriq.push(p);	
	
		while (true) {
			int y = traektoriq.peek().y;
			int x = traektoriq.peek().x;
			labirint[y][x] = 0;
			
			
			if (isValid(y + 1, x)) {
				// nadolu
				if (labirint[y + 1][x] == 2) {
					System.out.println("Nadolu. Chestito! Namerihte izhoda!");
					return;
				}
				else if (labirint[y + 1][x] == 1) {
					System.out.println("Nadolu");
					traektoriq.push(new Poziciq(y + 1, x));
					continue;	
				}
				else if (labirint[y + 1][x] == 3) {
					System.out.println("Bonus!!!");
					traektoriq.push(new Poziciq(y + 1, x));
					continue;	
				}
			}
			
			if (isValid(y, x - 1)) {
				// nalqvo
				if (labirint[y][x - 1] == 2) {
					System.out.println("Nalqvo. Chestito! Namerihte izhoda!");
					return;
				}
				else if (labirint[y][x - 1] == 1) {
					System.out.println("Nalqvo");
					traektoriq.push(new Poziciq(y, x - 1));
					continue;	
				}
				else if (labirint[y][x - 1] == 3) {
					System.out.println("Bonus!!!");
					traektoriq.push(new Poziciq(y, x - 1));
					continue;	
				}
			}
			if (isValid(y - 1,x)) {
				// nagore
				if (labirint[y - 1][x] == 2) {
					System.out.println("Nagore. Chestito! Namerihte izhoda!");
					return;
				}
				else if (labirint[y - 1][x] == 1) {
					System.out.println("Nagore");
					traektoriq.push(new Poziciq(y - 1,x));
					continue;	
				}
				else if (labirint[y - 1][x] == 3) {
					System.out.println("Bonus!");
					traektoriq.push(new Poziciq(y - 1,x));
					continue;	
				}
			}
			if (isValid(y, x + 1)) {
				// nadqsno
				if (labirint[y][x + 1] == 2) {
					System.out.println("Nadqsno. Chestito! Namerihte izhoda!");
					return;
				}
				else if (labirint[y][x + 1] == 1) {
					System.out.println("Nadqsno");
					traektoriq.push(new Poziciq(y,x + 1));
					continue;	
				}
				else if (labirint[y][x + 1] == 3) {
					System.out.println("Bonus!!!");
					traektoriq.push(new Poziciq(y,x + 1));
					continue;	
				}
			}
			
			traektoriq.pop();
			System.out.println("Prepqtstvie! Naobratno");
			if (traektoriq.size() <= 0) {
				System.out.println("Nqma pyt natam");
				return;
			}
		}
	}
	
	public static boolean isValid(int y, int x) {
		if (y < 0 || y >= labirint.length
				|| x < 0 || x >= labirint[y].length) {
			return false;
		}
		return true;
	}


	// USLOVIE: Naprevete algorithm, koito reshava labirint - napravete prepqtstviq i bonusi
	// 0 = Prepqtstvie
	// 1 = Traeektoriq
	// 2 = izhod
	// 3 = bonus
	
	static int [] [] labirint = {
			{2, 3, 1, 1},
			{0, 0, 1, 0},
			{0, 0, 0, 1}
	};
	
	static LinkedList<Poziciq> traektoriq = new LinkedList<Poziciq>();
}
