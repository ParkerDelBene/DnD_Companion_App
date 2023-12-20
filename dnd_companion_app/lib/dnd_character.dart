import 'package:dnd_companion_app/dnd_ability.dart';
import 'package:dnd_companion_app/dnd_class.dart';
import 'package:dnd_companion_app/dnd_feature.dart';
import 'package:dnd_companion_app/dnd_stats.dart';

class DnDCharacter {
  DnDCharacter(this.stats, this.dndclass, this.abilities, this.features);
  Stats stats;
  DnDClass dndclass;
  List<DnDAbility> abilities;
  List<DnDFeature> features;
}
