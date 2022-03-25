package extend.practice;

public class Slime extends Monster {
	public Slime(String name) {

		this.name = name;
		this.hp = 1200;
		this.offensive = 20;
	}

	@Override

	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.println(name + "が体当たりで攻撃！" + target.name + "に" + damage + "のダメージ！！");
		target.hp -= damage;
	}
}
