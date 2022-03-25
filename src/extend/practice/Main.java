package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Human> humans = new ArrayList<>();
		humans.add(new Brave("勇者"));
		humans.add(new Fighter("戦士"));
		humans.add(new Wizerd("魔法使い"));
		List<Monster> monsters = new ArrayList<>();
		monsters.add(new Slime("スライム"));
		monsters.add(new Oak("オーク"));
		monsters.add(new Dragon("ドラゴン"));
		while (true) {
			System.out.println("人間のターン！");
			Human h = humans.get(Rand.get(humans.size()));
			Monster m = monsters.get(Rand.get(monsters.size()));

			h.attack(m);
			if (m.hp <= 0) {
				System.out.println(m.name + "は倒れた！");
				monsters.remove(m);
			}

			if (monsters.isEmpty()) {
				System.out.println("勇者達は勝利した！");
				break;
			}

			System.out.println("モンスターのターン！");
			Human h2 = humans.get(Rand.get(humans.size()));
			Monster m2 = monsters.get(Rand.get(monsters.size()));

			m2.attack(h2);

			if (h2.hp <= 0) {
				humans.remove(h2);
				System.out.println(h2.name + "は倒れた！");
			}
			if (humans.isEmpty()) {
				System.out.println("モンスター達は勝利した！");
				break;
			}
		}
	}
}
