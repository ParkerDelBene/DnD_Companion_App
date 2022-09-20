package com.example.dndcharacterorganizer;

public class Monk extends DnD_Class {
    int maxKi;
    int currKi;
    String martialArtsDie;
    int kiDC;

    public Monk(Character character, String subclass) {
        this.maxKi = 0;
        this.currKi = 0;
        this.martialArtsDie = "1d4";
        this.kiDC = 8 + character.getProficiencyBonus() + character.getStats().getWisdom();
        this.setSubclass(subclass);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public void levelup(Stats stats) {
        this.setLevel(this.getLevel()+1);

        switch(this.getLevel()){

            case 1:
                String name = "Unarmored Defense";
                String description = "Beginning at 1st level, while you are wearing no armor and not wielding a shield, your AC equals 10 + your Dexterity modifier + your Wisdom modifier.";
                Ability temp = new Ability(name, description);

                this.getAbilities().add(temp);

                name = "Martial Arts";
                description = "At 1st level, your practice of martial arts gives you mastery of combat styles that use unarmed strikes and monk weapons, which are shortswords and any simple melee weapons that don't have the two-handed or heavy property.\n" +
                        "\n" +
                        "You gain the following benefits while you are unarmed or wielding only monk weapons and you aren't wearing armor or wielding a shield:\n" +
                        "\n" +
                        "    You can use Dexterity instead of Strength for the attack and damage rolls of your unarmed strikes and monk weapons.\n" +
                        "\n" +
                        "    You can roll a d4 in place of the normal damage of your unarmed strike or monk weapon. This die changes as you gain monk levels, as shown in the Martial Arts column of the Monk table.\n" +
                        "\n" +
                        "    When you use the Attack action with an unarmed strike or a monk weapon on your turn, you can make one unarmed strike as a bonus action. For example, if you take the Attack action and attack with a quarterstaff, you can also make an unarmed strike as a bonus action, assuming you haven't already taken a bonus action this turn.\n" +
                        "\n" +
                        "Certain monasteries use specialized forms of the monk weapons. For example, you might use a club that is two lengths of wood connected by a short chain (called a nunchaku) or a sickle with a shorter, straighter blade (called a kama). Whatever name you use for a monk weapon, you can use the game statistics provided for the weapon on the Weapons page.";

                temp = new Ability(name, description);

                this.getAbilities().add(temp);
                break;
            case 2:
                name = "Ki";

                description = "Starting at 2nd level, your training allows you to harness the mystic energy of ki. Your access to this energy is represented by a number of ki points. Your monk level determines the number of points you have, as shown in the Ki Points column of the Monk table.\n" +
                        "\n" +
                        "You can spend these points to fuel various ki features. You start knowing three such features: Flurry of Blows, Patient Defense, and Step of the Wind. You learn more ki features as you gain levels in this class.\n" +
                        "\n" +
                        "When you spend a ki point, it is unavailable until you finish a short or long rest, at the end of which you draw all of your expended ki back into yourself. You must spend at least 30 minutes of the rest meditating to regain your ki points.\n" +
                        "\n" +
                        "Some of your ki features require your target to make a saving throw to resist the feature's effects. The saving throw DC is calculated as follows:\n" +
                        "\n" +
                        "Ki save DC = 8 + your proficiency bonus + your Wisdom modifier\n" +
                        "\n" +
                        "    Flurry of Blows. Immediately after you take the Attack action on your turn, you can spend 1 ki point to make two unarmed strikes as a bonus action.\n" +
                        "\n" +
                        "    Patient Defense. You can spend 1 ki point to take the Dodge action as a bonus action on your turn.\n" +
                        "\n" +
                        "    Step of the Wind. You can spend 1 ki point to take the Disengage or Dash action as a bonus action on your turn, and your jump distance is doubled for the turn.\n";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi = 2;
                this.currKi = maxKi;

                name = "Unarmored Movement";

                description= "Starting at 2nd level, your speed increases by 10 feet while you are not wearing armor or wielding a shield. This bonus increases when you reach certain monk levels, as shown in the Monk table.\n" +
                        "\n" +
                        "At 9th level, you gain the ability to move along vertical surfaces and across liquids on your turn without falling during the move.";
                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                stats.setSpeed(stats.getSpeed() + 10);

                break;
            case 3:
                this.maxKi++;
                this.currKi=maxKi;

                name = "Monastic Tradition";
                description = "When you reach 3rd level, you commit yourself to a monastic subclass. Your subclass grants you features at 3rd level and again at 6th, 11th, and 17th level.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                name = "Deflect Missiles";
                description = "Starting at 3rd level, you can use your reaction to deflect or catch the missile when you are hit by a ranged weapon attack. When you do so, the damage you take from the attack is reduced by 1d10 + your Dexterity modifier + your monk level.\n" +
                        "\n" +
                        "If you reduce the damage to 0, you can catch the missile if it is small enough for you to hold in one hand and you have at least one hand free. If you catch a missile in this way, you can spend 1 ki point to make a ranged attack with a range of 20/60 using the weapon or piece of ammunition you just caught, as part of the same reaction. You make this attack with proficiency, regardless of your weapon proficiencies, and the missile counts as a monk weapon for the attack.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                if(this.getSubclass().equals("Astral Self")){
                    name = "Arms of the Astral Self";
                    description = "At 3rd level, your mastery of your ki allows you to summon a portion of your astral self. As a bonus action, you can spend 1 ki point to summon the arms of your astral self. When you do so, each creature of your choice that you can see within 10 feet of you must succeed on a Dexterity saving throw or take force damage equal to two rolls of your Martial Arts die.\n" +
                            "\n" +
                            "For 10 minutes, these spectral arms hover near your shoulders or surround your arms (your choice). You determine the arms' appearance, and they vanish early if you are incapacitated or die.\n" +
                            "\n" +
                            "While the spectral arms are present, you gain the following benefits:\n" +
                            "\n" +
                            "    You can use your Wisdom modifier in place of your Strength modifier when making Strength checks and Strength saving throws.\n" +
                            "\n" +
                            "    You can use the spectral arms to make unarmed strikes.\n" +
                            "\n" +
                            "    When you make an unarmed strike with the arms on your turn, your reach for it is 5 feet greater than normal.\n" +
                            "\n" +
                            "    The unarmed strikes you make with the arms can use your Wisdom modifier in place of your Strength or Dexterity modifier for the attack and damage rolls, and their damage type is force.\n";

                    temp = new Ability(name,description);

                    this.getAbilities().add(temp);

                }
                else if(this.getSubclass().equals("Drunken Master")){

                }
                else if(this.getSubclass().equals("Four Elements")){

                }
                else if(this.getSubclass().equals("Kensei")){

                }
                else if(this.getSubclass().equals("Long Death")){

                }
                else if(this.getSubclass().equals("Mercy")){

                }
                else if(this.getSubclass().equals("Open Hand")){

                }
                else if(this.getSubclass().equals("Shadow")){

                }
                else if(this.getSubclass().equals("Sun Soul")){

                }
                else if(this.getSubclass().equals("Ascendant Dragon")){

                }

                break;
            case 4:
                name = "Slow Fall";
                description = "Beginning at 4th level, you can use your reaction when you fall to reduce any falling damage you take by an amount equal to five times your monk level.";
                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 5:
                name = "Extra Attack";
                description = "Starting at 5th level, you can interfere with the flow of ki in an opponent's body. When you hit another creature with a melee weapon attack, you can spend 1 ki point to attempt a stunning strike. The target must succeed on a Constitution saving throw or be stunned until the end of your next turn.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.martialArtsDie = "1d6";


                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 6:
                name = "Ki-Empowered Strikes";
                description = "Starting at 6th level, your unarmed strikes count as magical for the purpose of overcoming resistance and immunity to nonmagical attacks and damage.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                stats.setSpeed(stats.getSpeed() + 5);

                this.setStats(stats);


                this.maxKi++;
                this.currKi=maxKi;


                if(this.getSubclass().equals("Astral Self")){

                }
                else if(this.getSubclass().equals("Drunken Master")){

                }
                else if(this.getSubclass().equals("Four Elements")){

                }
                else if(this.getSubclass().equals("Kensei")){

                }
                else if(this.getSubclass().equals("Long Death")){

                }
                else if(this.getSubclass().equals("Mercy")){

                }
                else if(this.getSubclass().equals("Open Hand")){

                }
                else if(this.getSubclass().equals("Shadow")){

                }
                else if(this.getSubclass().equals("Sun Soul")){

                }
                else if(this.getSubclass().equals("Ascendant Dragon")){

                }

                break;
            case 7:

                name = "Evasion";
                description = "At 7th level, your instinctive agility lets you dodge out of the way of certain area effects, such as a blue dragon's lightning breath or a fireball spell. When you are subjected to an effect that allows you to make a Dexterity saving throw to take only half damage, you instead take no damage if you succeed on the saving throw, and only half damage if you fail.";
                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                name = "Stillness of Mind";
                description = "Starting at 7th level, you can use your action to end one effect on yourself that is causing you to be charmed or frightened.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 8:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 9:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 10:

                name = "Purity of Body";
                description = "At 10th level, your mastery of the ki flowing through you makes you immune to disease and poison.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi++;
                this.currKi=maxKi;

                stats.setSpeed(stats.getSpeed() + 5);

                this.setStats(stats);

                break;
            case 11:
                this.maxKi++;
                this.currKi=maxKi;

                this.martialArtsDie = "1d8";


                if(this.getSubclass().equals("Astral Self")){

                }
                else if(this.getSubclass().equals("Drunken Master")){

                }
                else if(this.getSubclass().equals("Four Elements")){

                }
                else if(this.getSubclass().equals("Kensei")){

                }
                else if(this.getSubclass().equals("Long Death")){

                }
                else if(this.getSubclass().equals("Mercy")){

                }
                else if(this.getSubclass().equals("Open Hand")){

                }
                else if(this.getSubclass().equals("Shadow")){

                }
                else if(this.getSubclass().equals("Sun Soul")){

                }
                else if(this.getSubclass().equals("Ascendant Dragon")){

                }

                break;
            case 12:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 13:
                name = "Tongue of the Sun and Moon";
                description = "Starting at 13th level, you learn to touch the ki of other minds so that you understand all spoken languages. Moreover, any creature that can understand a language can understand what you say.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 14:
                name = "Diamond Soul";
                description = "Beginning at 14th level, your mastery of ki grants you proficiency in all saving throws.\n" +
                        "\n" +
                        "Additionally, whenever you make a saving throw and fail, you can spend 1 ki point to reroll it and take the second result.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                stats.setStrengthSave(true);
                stats.setDexteritySave(true);
                stats.setConstitutionSave(true);
                stats.setIntelligenceSave(true);
                stats.setWisdomSave(true);
                stats.setCharismaSave(true);

                this.maxKi++;
                this.currKi=maxKi;

                stats.setSpeed(stats.getSpeed() + 5);

                this.setStats(stats);

                break;
            case 15:
                name = "Timeless BOdy";
                description = "At 15th level, your ki sustains you so that you suffer none of the frailty of old age, and you can't be aged magically. You can still die of old age, however. In addition, you no longer need food or water.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 16:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 17:
                this.maxKi++;
                this.currKi=maxKi;

                this.martialArtsDie = "1d10";

                if(this.getSubclass().equals("Astral Self")){

                }
                else if(this.getSubclass().equals("Drunken Master")){

                }
                else if(this.getSubclass().equals("Four Elements")){

                }
                else if(this.getSubclass().equals("Kensei")){

                }
                else if(this.getSubclass().equals("Long Death")){

                }
                else if(this.getSubclass().equals("Mercy")){

                }
                else if(this.getSubclass().equals("Open Hand")){

                }
                else if(this.getSubclass().equals("Shadow")){

                }
                else if(this.getSubclass().equals("Sun Soul")){

                }
                else if(this.getSubclass().equals("Ascendant Dragon")){

                }

                break;
            case 18:
                name = "Empty Body";
                description = "Beginning at 18th level, you can use your action to spend 4 ki points to become invisible for 1 minute. During that time, you also have resistance to all damage but force damage.\n" +
                        "\n" +
                        "Additionally, you can spend 8 ki points to cast the Astral Projection spell, without needing material components. When you do so, you can't take any other creatures with you.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi++;
                this.currKi=maxKi;

                stats.setSpeed(stats.getSpeed() + 5);

                this.setStats(stats);

                break;
            case 19:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 20:
                name = "Perfect Self";
                description = "At 20th level, when you roll for initiative and have no ki points remaining, you regain 4 ki points.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);

                this.maxKi++;
                this.currKi=maxKi;

                break;
        }
    }

    @Override
    public void shortrest() {

    }

    @Override
    public void longrest() {

    }


}
