class DnDAbility {
  DnDAbility(this.name, this.description, this.charges);
  final String name;
  final String description;
  int charges;

  @override
  String toString() {
    return "$name;$description;$charges";
  }
}
