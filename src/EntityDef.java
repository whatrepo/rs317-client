import java.io.FileWriter;

public final class EntityDef {

	public static EntityDef forID(int i, boolean cached) {
		if (cached) {
			for (int j = 0; j < 20; j++)
				if (cache[j].interfaceType == (long) i)
					return cache[j];
		}
		anInt56 = (anInt56 + 1) % 20;
		EntityDef entityDef = new EntityDef();
		if (cached) {
			cache[anInt56] = entityDef;
		}
		stream.currentOffset = streamIndices[i];
		entityDef.interfaceType = i;
		entityDef.readValues(stream);

		// Start of customor modified NPCs
		switch (i) {

		
		case 6144:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14522;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 10355;
			entityDef.anIntArray70[1] = 10471;
			entityDef.anIntArray70[2] = 10941;
			entityDef.anIntArray70[3] = 11200;
			entityDef.anIntArray70[4] = 11187;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 3;
			break;

		case 6145:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[4];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14523;
			entityDef.anIntArray94[2] = 14524;
			entityDef.anIntArray94[3] = 14525;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 63411;
			entityDef.anIntArray70[1] = 63287;
			entityDef.anIntArray70[2] = 63163;
			entityDef.anIntArray70[3] = 63046;
			entityDef.anIntArray70[4] = 63046;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 3;
			break;
		case 6401:
			entityDef.name = "Enraged Cow";
			entityDef.combatLevel = 9001;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.description = "That cow is pissed off....".getBytes();
			entityDef.anInt86 = 200;
			entityDef.anInt91 = 200;
			break;
		case 7152:
			entityDef.name = "Demonic Gorilla";
			entityDef.combatLevel = 275;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.description = "Not to be confused with an Ancient Gorilla.".getBytes();
			break;	
		case 5884:
			entityDef.name = "Abyssal Monarch";
			entityDef.combatLevel = 155;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.description = "A dark and mysterious monster.".getBytes();
			entityDef.anInt86 = 225;
			entityDef.anInt91 = 225;
			break;
		case 3922:
			entityDef.combatLevel = 138;
			break;
		case 765:
			entityDef.name = "Raid Queen";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-To";
			entityDef.actions[2] = "Create";
			entityDef.actions[3] = "Tutorial";
			entityDef.description = "The queen of raids..".getBytes();
			break;
		case 7612:
			entityDef.name = "Krato (Quest)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-To";
			entityDef.actions[2] = "Crystals";
			entityDef.description = "Help him find the Crystals".getBytes();
			break;
			
		case 846:
			entityDef.name = "Toy penguin";
			break;
			
		case 1350:
			entityDef.name = "Barrows merchant";
			entityDef.actions = new String[5];
			entityDef.actions[1] = null;
			break;
			
		case 1419:
			entityDef.name = "Pet Raccoon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1256:
			entityDef.name = "Pet evil creature";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1257:
			entityDef.name = "Fluffy";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4823:
			entityDef.name = "Pet goldfish";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 436:
			entityDef.name = "Pet pyrefiend";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 102:
			entityDef.name = "Pet rockcrab";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 5268:
			entityDef.name = "Baby monkey";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
		case 5274:
			entityDef.combatLevel = 120;
			break;
		case 416:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.combatLevel = 0;
			entityDef.anInt86 = 35;
			entityDef.anInt91 = 35;
			break;

		case 1465:
			entityDef.name = "Pet Gorilla";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;


		case 5842:
			entityDef.name = "Pet Cow";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anInt86 = 50;
			entityDef.anInt91 = 50;
			entityDef.description = "Moo Bitch.. Get out the way.".getBytes();
			break;

		case 107:
			entityDef.name = "Wolf Pup";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anInt86 = 65;
			entityDef.anInt91 = 65;
			entityDef.description = "Hes so adorable!".getBytes();
			break;

		case 2096:
			entityDef.name = "Ogre";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anInt86 = 65;
			entityDef.anInt91 = 65;
			entityDef.description = "Did you know maces have prayer bonus?".getBytes();
			break;	
		case 3845:
			entityDef.name = "Pet Broom?";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1475:
			entityDef.name = "Chompy chick";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2906:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2903:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 3449:
			entityDef.name = "Pet shadow hound";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2904:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2905:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 132323:
			entityDef.name = "Baby chinchompa";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 13324:
			entityDef.name = "Baby chinchompa";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 13325:
			entityDef.name = "Baby chinchompa";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
		
		case 13326:
			entityDef.name = "Baby chinchompa";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
			
		case 1346:
			entityDef.name = "Pet kebbit";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1342:
			entityDef.name = "Pet falcon";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 0:
			entityDef.name = "Leprechaun follower";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4927:
			entityDef.name = "Pet Phoenix";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 296:
			entityDef.name = "Dwarf follower";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1163:
			entityDef.name = "Pet tree spirit";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 5728:
			entityDef.name = "Inslaved imp";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 5341:
			entityDef.name = "Spiritual follower";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 2583:
			entityDef.name = "Pet Abyssal leech";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2781:
			entityDef.name = "Toy Mouse";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1062:
			entityDef.name = "Hell rat";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1065:
			entityDef.name = "Hell goblin";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 80;
			entityDef.anInt91 = 80;
			break;
			
		case 1067:
			entityDef.name = "Mutant";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1072:
			entityDef.name = "Soulless one";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 4324:
			entityDef.name = "Zanik";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4326:
			entityDef.name = "Inslaved imp";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4228:
			entityDef.name = "Guard Dog";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 111:
			entityDef.name = "German Shepard";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1830:
			entityDef.name = "Pet shark";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
	       case 4162:
			entityDef.name = "Rodrigo Prieto";
			entityDef.combatLevel = 100;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 150;
			entityDef.anInt91 = 150;
			break;
	       case 3951:
			entityDef.name = "Sythescape Guard";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
	       case 5523:
			entityDef.name = "Membership";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Teleport";
			break;
			
			
		case 1831:
			entityDef.name = "White swan";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1832:
			entityDef.name = "Black swan";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1854:
			entityDef.name = "Crimson monarch";
			entityDef.combatLevel = 1337;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;	
			
			
		case 3936:
			entityDef.name = "Sailor(City Teleports)";
			break;
			
		case 84:
			entityDef.name = "Skeleton warlock";
			entityDef.combatLevel = 333;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 250;
			entityDef.anInt91 = 250;
			break;
			
		case 3358:
			entityDef.name = "Ancient skeleton archer";
			entityDef.combatLevel = 360;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 250;
			entityDef.anInt91 = 250;
			break;
			
		case 1540:
			entityDef.name = "Skeleton warrior";
			entityDef.combatLevel = 360;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 250;
			entityDef.anInt91 = 250;
			break;
			
		case 3627:
			entityDef.name = "Ghostly follower";
			entityDef.combatLevel = 666;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 1853:
			entityDef.name = "Pet rabbit";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2914:
			entityDef.name = "Otto Godblessed(ZHasta)";
			break;
			
		case 3221:
			entityDef.name = "Mining points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 2662:
			entityDef.name = "PVM points shop";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3463:
			entityDef.name = "Boss points shop";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3225:
			entityDef.name = "Smithing points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 5810:
			entityDef.name = "Crafting points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3825:
			entityDef.name = "Thieving points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 5457:
			entityDef.name = "Herblore point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3585:
			entityDef.name = "Effigy(Lunar point shop)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3223:
			entityDef.name = "Prayer point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 4397:
			entityDef.name = "Runecrafting point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
		
		case 603:// Accessories
			entityDef.name = "Accessories";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;
			
		case 4227:
			entityDef.name = "Fletching point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3226:
			entityDef.name = "Woodcutting point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 6426:
			entityDef.name = "Firemaking point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3219:
			entityDef.name = "Cooking point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 2913:
			entityDef.name = "Fishing point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 5958:
			entityDef.name = "Farming point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 6146:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14522;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 10355;
			entityDef.anIntArray70[1] = 10471;
			entityDef.anIntArray70[2] = 10941;
			entityDef.anIntArray70[3] = 11200;
			entityDef.anIntArray70[4] = 11187;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 3;
			break;

		case 6147:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[4];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14523;
			entityDef.anIntArray94[2] = 14524;
			entityDef.anIntArray94[3] = 14525;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 63411;
			entityDef.anIntArray70[1] = 63287;
			entityDef.anIntArray70[2] = 63163;
			entityDef.anIntArray70[3] = 63046;
			entityDef.anIntArray70[4] = 63046;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 3;
			break;

			
		case 1518:
			entityDef.name = "Fishing Spot";
			break;

		case 1526:
			entityDef.name = "Fishing Spot";
			break;

		case 1520:
			entityDef.name = "Fishing Spot";
			break;

		case 1534:
			entityDef.name = "Fishing Spot";
			break;

		case 1536:
			entityDef.name = "Fishing Spot";
			break;
			
		case 781:
			entityDef.name = "Skilling Guide";
			break;
			
		case 732:
			entityDef.name = "Farming/Herblore supplies";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;
			
		case 3843:
			entityDef.name = "Lunar Guide";
			break;
			
		case 6348:
			entityDef.name = "Chaos Knight";
			entityDef.combatLevel = 84;
			break;
			
		case 1578:
			entityDef.name = "Corrupt sorceress";
			entityDef.combatLevel = 126;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 250;
			entityDef.anInt91 = 250;
			break;
			
		case 2643:
			entityDef.name = "Zezima";
			entityDef.combatLevel = 126;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 150;
			entityDef.anInt91 = 150;
			break;
			
		case 4497:
			entityDef.name = "Skeleton warlord";
			entityDef.combatLevel = 360;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 250;
			entityDef.anInt91 = 250;
			break;
			
		case 4496:
			entityDef.name = "Pet skeleton warlord";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 244:
			entityDef.name = "Pet red dragon";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 6119:
			entityDef.name = "The Inadequacy";
			break;
			
		case 3473:
			entityDef.name = "Pet Inadequacy";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 25;
			entityDef.anInt91 = 25;
			break;
			
		case 3160:
			entityDef.name = "Mini Plague";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 3578:
			entityDef.combatLevel = 83;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 150;
			entityDef.anInt91 = 150;
			break;
			
		case 1103:
			entityDef.actions = new String[5];
			entityDef.name = "Game Instructor";
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[3] = "Open Store";
			break;
			
		case 13178:
		case 495:
		case 5907:
		case 318:
		case 497:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			break;
			
		case 3680:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Travel";
			break;
			
		case 3231:
			entityDef.name = "Jeremy Fisher";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Tan Hides";
			break;
			
		case 394:
		case 2182:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Bank";
			break;
			
		case 311:
			entityDef.name = "Adam(Ironman)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 3844:
			entityDef.name = "Lunar Guard(Security)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 6749:
			entityDef.name = "Dunce(Members Titles)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 1327:
			entityDef.name = "Spartan(NPC Drop Tables)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[3] = "Open Drop Tables";
			break;
			
		case 5527:
			entityDef.name = "Achievements Store";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;
			
		case 6524:
			entityDef.name = "Potion Decantor";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[3] = "Decant";
			break;
			
		case 5525:
			entityDef.name = "Tobi(Members Support)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Teleport";
			break;
			
		case 1603:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;

		case 4000:
			entityDef.name = "Prince black dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 17414, 17415, 17429, 17422 };
			entityDef.walkAnim = 4635;
			entityDef.standAnim = 90;
			entityDef.anInt86 = 50;
			entityDef.anInt91 = 50;
			break;
			
		case 446:
			entityDef.name = "Pet infernal Mage";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.walkAnim = 1205;
			entityDef.standAnim = 813;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;
			
		case 4001:
			entityDef.name = "Pet general graardor";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 27660, 27665 };
			entityDef.walkAnim = 7016;
			entityDef.standAnim = 7017;
			entityDef.anInt86 = 40;
			entityDef.anInt91 = 40;
			break;

		case 4002:
			entityDef.name = "Pet corporeal beast";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 11056 };
			entityDef.walkAnim = 1684;
			entityDef.standAnim = 1678;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
			break;

		case 4003:
			entityDef.name = "Pet kree'Arra";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 28019, 28021, 28020 };
			entityDef.walkAnim = 6977;
			entityDef.standAnim = 6976;
			entityDef.anInt86 = 25;
			entityDef.anInt91 = 25;
			break;

		case 4004:
			entityDef.name = "Pet k'ril tsutsaroth";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 27683, 27681, 27692, 27682, 27690 };
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 4070;
			entityDef.standAnim = 6935;
			entityDef.anInt86 = 25;
			entityDef.anInt91 = 25;
			break;

		case 4009:
			entityDef.name = "Pet commander zilyana";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 27989, 27937, 27985, 27968, 27990 };
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 6965;
			entityDef.standAnim = 6966;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;

		case 4006:
			entityDef.name = "Pet dagannoth supreme";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9941, 9943 };
			entityDef.standAnim = 2850;
			entityDef.walkAnim = 2849;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;

		case 4007:
			entityDef.name = "Pet dagannoth prime"; // 9940, 9943, 9942
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9940, 994, 9942 };
			entityDef.walkAnim = 2849;
			entityDef.standAnim = 2850;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;

		case 4008:
			entityDef.name = "Pet dagannoth rex";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9941 };
			entityDef.walkAnim = 2849;
			entityDef.standAnim = 2850;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;
			
		case 4010:
			entityDef.name = "Tzrek-jad";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9319 };
			entityDef.walkAnim = 2651;
			entityDef.standAnim = 2650;
			entityDef.anInt86 = 25;
			entityDef.anInt91 = 25;
			break;
			
		case 963:
			entityDef.name = "Kalphite queen";
			entityDef.combatLevel = 360;
			entityDef.anIntArray94 = new int[] { 24602, 24605, 24606 };
			entityDef.walkAnim = 6236;
			entityDef.standAnim = 6236;
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			break;
			
		case 964:
			entityDef.name = "Kalphite queen";
			entityDef.combatLevel = 360;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[] { 24597, 24598 };
			entityDef.walkAnim = 6238;
			entityDef.standAnim = 6239;
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			break;
			
		case 5547:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			break;
			
		case 5559:
		case 5560:
		case 6637:
		case 6638:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Metamorphosis";
			break;
			
		case 2130:
		case 2131:
		case 2132:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Metamorphosis";
			break;
			
		case 155:// titles
			entityDef.name = "Jackie (Titles shop)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.anInt86 = 200;
			entityDef.anInt91 = 200;
			break;

		case 518:// General Store
		case 519:
			entityDef.name = "General store";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;
			
		case 276:
			entityDef.name = "Trivia shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 5529:
			entityDef.name = "Hunting point shop ";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 6525:// Decantor
			entityDef.name = "Decantor shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;

		case 3984:// Potion Pack
			entityDef.name = "Packs Shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 403:// Vannaka
			entityDef.name = "Vannaka(Slayer master)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;

		case 1758:// Void knight store
			entityDef.name = "Void knight";
			entityDef.actions[0] = "Store";
			break;

		case 1756:// Void knight
			entityDef.name = "Void knight";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 606:// Prestige
			entityDef.name = "Captain Rott(Prestige shop)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Prestige";
			break;

		case 490:// Neive
			entityDef.name = "Nieve(Slayer master)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;

		case 326:// Genie
			entityDef.name = "Genie(Skill reset)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[2] = "Reset";
			break;

		case 4936:// Mage of Zamorak
			entityDef.name = "Mage of Zamorak(Runecrafting)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Teleport";
			break;
			

		case 22:// Merchant
			entityDef.name = "Stall Merchant";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Sell Goods";
			break;

		case 505:// Skilling
			entityDef.name = "Skilling supplies";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 225:// Cook
			entityDef.name = "Food & Potions";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 527:// Weapons
			entityDef.name = "Weapons shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 528:// Armour
			entityDef.name = "Armour shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 536:// Range
			entityDef.name = "Range shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 5314:// Magic
			entityDef.name = "Magic shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 3461:// pure store
			entityDef.name = "Pure shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 534:// Clothing
			entityDef.name = "Outfit shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 315:// Emblem Trader
			entityDef.name = "Emblem trader(PVP Shop)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Skull";
			break;

		}

		return entityDef;
	}

	public static EntityDef forID(int i) {
		return forID(i, true);
	}

	public Model method160() {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method160();
		}
		if (anIntArray73 == null)
			return null;
		boolean flag1 = false;
		for (int i = 0; i < anIntArray73.length; i++)
			if (!Model.method463(anIntArray73[i]))
				flag1 = true;

		if (flag1)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray73.length];
		for (int j = 0; j < anIntArray73.length; j++)
			aclass30_sub2_sub4_sub6s[j] = Model.method462(anIntArray73[j]);

		Model model;
		if (aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
		if (anIntArray76 != null) {
			for (int k = 0; k < anIntArray76.length; k++)
				model.method476(anIntArray76[k], anIntArray70[k]);

		}
		return model;
	}

	public EntityDef method161() {
		int j = -1;
		if (anInt57 != -1) {
			VarBit varBit = VarBit.cache[anInt57];
			int k = varBit.anInt648;
			int l = varBit.anInt649;
			int i1 = varBit.anInt650;
			int j1 = Client.anIntArray1232[i1 - l];
			j = clientInstance.variousSettings[k] >> l & j1;
		} else if (anInt59 != -1)
			j = clientInstance.variousSettings[anInt59];
		if (j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
			return null;
		else
			return forID(childrenIDs[j]);
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(streamLoader.getDataForName("npc.dat"));
		Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
		int totalNPCs = stream2.readUnsignedWord();
		System.out.println("Npcs Loaded: " + totalNPCs);
		streamIndices = new int[totalNPCs + 50000];
		int i = 2;
		for (int j = 0; j < totalNPCs; j++) {
			streamIndices[j] = i;
			i += stream2.readUnsignedWord();
		}

		cache = new EntityDef[20];
		for (int k = 0; k < 20; k++)
			cache[k] = new EntityDef();
		for (int index = 0; index < totalNPCs; index++) {
			EntityDef ed = forID(index);
			if (ed == null)
				continue;
			if (ed.name == null)
				continue;
		}
		boolean dump = false;
		if (dump) {
			try {
				FileWriter fw = new FileWriter(System.getProperty("user.home")+"/Desktop/NPC Dump.txt");
				for(int id = 0; id < totalNPCs; id++) {
					EntityDef ed = EntityDef.forID(id);
					fw.write("case "+id+":");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.name = \""+ed.name+"\";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.description = \""+ed.description+"\";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.combatLevel = "+ed.combatLevel+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.walkAnim = "+ed.walkAnim+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.standAnim = "+ed.standAnim+";");
					fw.write(System.getProperty("line.separator"));
					if(ed.actions != null) {
						fw.write("entityDef.actions = new String["+ed.actions.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.actions.length; range++) {
							if(ed.actions[range] != null) {
								fw.write("entityDef.actions["+range+"] = \""+ed.actions[range]+"\";");
								fw.write(System.getProperty("line.separator"));
							}
						}
					}
					if(ed.anIntArray94 != null) { 
						fw.write("entityDef.models = new int["+ed.anIntArray94.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.anIntArray94.length; range++) {
							fw.write("entityDef.models["+range+"] = "+ed.anIntArray94[range]+";");
							fw.write(System.getProperty("line.separator"));
						}
					}
					if(ed.anIntArray76 != null) {
						fw.write("entityDef.originalModelColors = new int["+ed.anIntArray76.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.anIntArray76.length; range++) {
							fw.write("entityDef.originalModelColors["+range+"] = "+ed.anIntArray76[range]+";");
							fw.write(System.getProperty("line.separator"));
						}
					}
					if(ed.anIntArray70 != null) {
						fw.write("entityDef.modifiedModelColors = new int["+ed.anIntArray70.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.anIntArray70.length; range++) {
							fw.write("entityDef.modifiedModelColors["+range+"] = "+ed.anIntArray70[range]+";");
							fw.write(System.getProperty("line.separator"));
						}
					}
					fw.write("entityDef.anInt91 = "+ed.anInt91+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.anInt86 = "+ed.anInt86+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.aByte68 = "+ed.aByte68+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("break;"); 
					fw.write(System.getProperty("line.separator"));
					fw.write(System.getProperty("line.separator"));
				}
				fw.close();
				System.out.println("NPC Dump Finished.");
				System.out.println("Total NPCs: "+totalNPCs);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void nullLoader() {
		mruNodes = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	 public Model method164(int j, int currAnim, int nextAnim, int currCycle, int nextCycle, int ai[]) {
	        if (childrenIDs != null) {
	            final EntityDef type = method161();
	            if (type == null) {
	                return null;
	            } else {
	                return type.method164(j, currAnim, ai);
	            }
	        }
	        Model model = (Model) mruNodes.insertFromCache(interfaceType);
	        if (model == null) {
	            boolean flag = false;
	            for (int i1 = 0; i1 < anIntArray94.length; i1++) {
	                if (!Model.method463(anIntArray94[i1])) {
	                    flag = true;
	                }
	            }
	            if (flag) {
	                return null;
	            }
	            final Model[] parts = new Model[anIntArray94.length];
	            for (int j1 = 0; j1 < anIntArray94.length; j1++) {
	                parts[j1] = Model.method462(anIntArray94[j1]);
	            }
	            if (parts.length == 1) {
	                model = parts[0];
	            } else {
	                model = new Model(parts.length, parts);
	            }
	            if(anIntArray70 != null)
				{
					for(int k1 = 0; k1 < anIntArray70.length; k1++)
						model.method476(anIntArray70[k1], anIntArray76[k1]);

				}
	            model.method469();
	            model.method479(64 + anInt85, 1500 + anInt92, -30, -50, -30, true);
	            mruNodes.removeFromCache(model, interfaceType);
	        }
	        final Model model_1 = Model.aModel_1621;
	        model_1.method464(model, SequenceFrame.method532(currAnim) & SequenceFrame.method532(j));
	        if (currAnim != -1 && j != -1) {
	            model_1.method478(anInt91, anInt91, anInt86);
	        } else if (currAnim != -1) {
	             model_1.interpolateFrames(currAnim, nextAnim, nextCycle, currCycle);
	        }
	        if (anInt91 != 128 || anInt86 != 128) {
	            model_1.method478(anInt91, anInt86, anInt91);
	        }
	        model_1.method466();
			model_1.anIntArrayArray1658 = null;
			model_1.anIntArrayArray1657 = null;
			if(aByte68 == 1)
				model_1.aBoolean1659 = true;
			return model_1;
		}
	
	public Model method164(int j, int k, int ai[]) {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method164(j, k, ai);
		}
		Model model = (Model) mruNodes.insertFromCache(interfaceType);
		if (model == null) {
			boolean flag = false;
			for (int i1 = 0; i1 < anIntArray94.length; i1++)
				if (!Model.method463(anIntArray94[i1]))
					flag = true;

			if (flag)
				return null;
			Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray94.length];
			for (int j1 = 0; j1 < anIntArray94.length; j1++)
				aclass30_sub2_sub4_sub6s[j1] = Model.method462(anIntArray94[j1]);

			if (aclass30_sub2_sub4_sub6s.length == 1)
				model = aclass30_sub2_sub4_sub6s[0];
			else
				model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
			if (anIntArray76 != null) {
				for (int k1 = 0; k1 < anIntArray76.length; k1++)
					model.method476(anIntArray76[k1], anIntArray70[k1]);

			}
			model.method469();
			model.method479(64 + anInt85, 1500 + anInt92, -30, -50, -30, true);
			mruNodes.removeFromCache(model, interfaceType);
		}
		Model model_1 = Model.aModel_1621;
		model_1.method464(model, SequenceFrame.method532(k) & SequenceFrame.method532(j));
		if (k != -1 && j != -1)
			model_1.method471(ai, j, k);
		else if (k != -1)
			model_1.method470(k);
		if (anInt91 != 128 || anInt86 != 128)
			model_1.method478(anInt91, anInt91, anInt86);
		model_1.method466();
		model_1.anIntArrayArray1658 = null;
		model_1.anIntArrayArray1657 = null;
		if (aByte68 == 1)
			model_1.aBoolean1659 = true;
		return model_1;
	}

	public void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1) {
				int j = stream.readUnsignedByte();
				anIntArray94 = new int[j];
				for (int j1 = 0; j1 < j; j1++)
					anIntArray94[j1] = stream.readUnsignedWord();

			} else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readBytes();
			else if (i == 12)
				aByte68 = stream.readSignedByte();
			else if (i == 13)
				standAnim = stream.readUnsignedWord();
			else if (i == 14)
				walkAnim = stream.readUnsignedWord();
			else if (i == 17) {
				walkAnim = stream.readUnsignedWord();
				anInt58 = stream.readUnsignedWord();
				anInt83 = stream.readUnsignedWord();
				anInt55 = stream.readUnsignedWord();
			} else if (i >= 30 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 30] = stream.readString();
				if (actions[i - 30].equalsIgnoreCase("hidden"))
					actions[i - 30] = null;
			} else if (i == 40) {
				int k = stream.readUnsignedByte();
				anIntArray76 = new int[k];
				anIntArray70 = new int[k];
				for (int k1 = 0; k1 < k; k1++) {
					anIntArray76[k1] = stream.readUnsignedWord();
					anIntArray70[k1] = stream.readUnsignedWord();
				}

			} else if (i == 60) {
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for (int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedWord();

			} else if (i == 90)
				stream.readUnsignedWord();
			else if (i == 91)
				stream.readUnsignedWord();
			else if (i == 92)
				stream.readUnsignedWord();
			else if (i == 93)
				aBoolean87 = false;
			else if (i == 95)
				combatLevel = stream.readUnsignedWord();
			else if (i == 97)
				anInt91 = stream.readUnsignedWord();
			else if (i == 98)
				anInt86 = stream.readUnsignedWord();
			else if (i == 99)
				aBoolean93 = true;
			else if (i == 100)
				anInt85 = stream.readSignedByte();
			else if (i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else if (i == 102)
				anInt75 = stream.readUnsignedWord();
			else if (i == 103)
				anInt79 = stream.readUnsignedWord();
			else if (i == 106) {
				anInt57 = stream.readUnsignedWord();
				if (anInt57 == 65535)
					anInt57 = -1;
				anInt59 = stream.readUnsignedWord();
				if (anInt59 == 65535)
					anInt59 = -1;
				int i1 = stream.readUnsignedByte();
				childrenIDs = new int[i1 + 1];
				for (int i2 = 0; i2 <= i1; i2++) {
					childrenIDs[i2] = stream.readUnsignedWord();
					if (childrenIDs[i2] == 65535)
						childrenIDs[i2] = -1;
				}

			} else if (i == 107)
				aBoolean84 = false;
		} while (true);
	}

	public EntityDef() {
		anInt55 = -1;
		anInt57 = -1;
		anInt58 = -1;
		anInt59 = -1;
		combatLevel = -1;
		anInt64 = 1834;
		walkAnim = -1;
		aByte68 = 1;
		anInt75 = -1;
		standAnim = -1;
		interfaceType = -1L;
		anInt79 = 32;
		anInt83 = -1;
		aBoolean84 = true;
		anInt86 = 128;
		aBoolean87 = true;
		anInt91 = 128;
		aBoolean93 = false;
	}

	public int anInt55;
	public static int anInt56;
	public int anInt57;
	public int anInt58;
	public int anInt59;
	public static Stream stream;
	public int combatLevel;
	public final int anInt64;
	public String name;
	public String actions[];
	public int walkAnim;
	public byte aByte68;
	public int[] anIntArray70;
	public static int[] streamIndices;
	public int[] anIntArray73;
	public int anInt75;
	public int[] anIntArray76;
	public int standAnim;
	public long interfaceType;
	public int anInt79;
	public static EntityDef[] cache;
	public static Client clientInstance;
	public int anInt83;
	public boolean aBoolean84;
	public int anInt85;
	public int anInt86;
	public boolean aBoolean87;
	public int childrenIDs[];
	public byte description[];
	public int anInt91;
	public int anInt92;
	public boolean aBoolean93;
	public int[] anIntArray94;
	public static MRUNodes mruNodes = new MRUNodes(30);

}
