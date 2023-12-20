class Stats {
  const Stats(this.strength, this.dexterity, this.constitution,
      this.intelligence, this.wisdom, this.charisma);

  final int strength;
  final int dexterity;
  final int constitution;
  final int intelligence;
  final int wisdom;
  final int charisma;

  @override
  String toString() {
    return "$strength;$dexterity;$constitution;$intelligence;$wisdom;$charisma";
  }
}
