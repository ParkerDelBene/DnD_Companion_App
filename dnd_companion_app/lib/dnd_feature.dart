class DnDFeature {
  const DnDFeature(this.name, this.description);
  final String name;
  final String description;

  @override
  String toString() {
    return "$name;$description";
  }
}
