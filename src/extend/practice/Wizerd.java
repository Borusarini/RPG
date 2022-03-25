package extend.practice;

public class Wizerd extends Human {
	public Wizerd(String name) {

		this.name = name;
		this.hp = 700;
		this.offensive = 10;
	}

	@Override
	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.println(name + "が魔法で攻撃！" + target.name + "に" + damage + "のダメージ！！");
		target.hp -= damage;

	}
}
