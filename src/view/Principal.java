package view;

import model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista l = new Lista();

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				l.addFirst(i * i);
			} else if (i <= 6) {
				l.addFirst(i);
			} else  {
				try {
					System.out.println(l.get(l.size() - 1));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					l.removeLast();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		int tamanho = l.size();
		System.out.println("Lista Final "  + tamanho);

		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.println(l.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
