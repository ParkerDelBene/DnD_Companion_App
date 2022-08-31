package com.example.dndcharacterorganizer;

public class Monk extends DnD_Class {
    int maxKi;
    int currKi;
    String martialArtsDie;
    int kiDC;
    String tradition;

    public Monk(Character character, String tradition) {
        this.maxKi = 0;
        this.currKi = 0;
        this.martialArtsDie = "1d4";
        this.kiDC = 8 + character.getProficiencyBonus() + character.getStats().getWisdom();
        this.tradition = tradition;
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
                description = "When you reach 3rd level, you commit yourself to a monastic tradition. Your tradition grants you features at 3rd level and again at 6th, 11th, and 17th level.";

                temp = new Ability(name,description);

                this.getAbilities().add(temp);
                if(tradition == "Astral Self"){
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
                else if(tradition == "Drunken Master"){

                }
                else if(tradition == "Four Elements"){

                }
                else if(tradition == "Kensei"){

                }
                else if(tradition == "Long Death"){

                }
                else if(tradition == "Mercy"){

                }
                else if(tradition == "Open Hand"){

                }
                else if(tradition == "Shadow"){

                }
                else if(tradition == "Sun Soul"){

                }
                else if(tradition == "Ascendant Dragon"){

                }

                break;
            case 4:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 5:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 6:
                this.maxKi++;
                this.currKi=maxKi;


                if(tradition == "Astral Self"){

                }
                else if(tradition == "Drunken Master"){

                }
                else if(tradition == "Four Elements"){

                }
                else if(tradition == "Kensei"){

                }
                else if(tradition == "Long Death"){

                }
                else if(tradition == "Mercy"){

                }
                else if(tradition == "Open Hand"){

                }
                else if(tradition == "Shadow"){

                }
                else if(tradition == "Sun Soul"){

                }
                else if(tradition == "Ascendant Dragon"){

                }

                break;
            case 7:
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
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 11:
                this.maxKi++;
                this.currKi=maxKi;


                if(tradition == "Astral Self"){

                }
                else if(tradition == "Drunken Master"){

                }
                else if(tradition == "Four Elements"){

                }
                else if(tradition == "Kensei"){

                }
                else if(tradition == "Long Death"){

                }
                else if(tradition == "Mercy"){

                }
                else if(tradition == "Open Hand"){

                }
                else if(tradition == "Shadow"){

                }
                else if(tradition == "Sun Soul"){

                }
                else if(tradition == "Ascendant Dragon"){

                }

                break;
            case 12:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 13:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 14:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 15:
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

                if(tradition == "Astral Self"){

                }
                else if(tradition == "Drunken Master"){

                }
                else if(tradition == "Four Elements"){

                }
                else if(tradition == "Kensei"){

                }
                else if(tradition == "Long Death"){

                }
                else if(tradition == "Mercy"){

                }
                else if(tradition == "Open Hand"){

                }
                else if(tradition == "Shadow"){

                }
                else if(tradition == "Sun Soul"){

                }
                else if(tradition == "Ascendant Dragon"){

                }

                break;
            case 18:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 19:
                this.maxKi++;
                this.currKi=maxKi;

                break;
            case 20:
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
