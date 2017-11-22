


public final class ItemDef {
	
	public static ItemDef forID(int i) {
		for (int j = 0; j < 10; j++)
			if (cache[j].id == i)
				return cache[j];

		cacheIndex = (cacheIndex + 1) % 10;
		ItemDef itemDef = cache[cacheIndex];
		stream.currentOffset = streamIndices[i];
		itemDef.id = i;
		itemDef.setDefaults();
		itemDef.readValues(stream);
		if (itemDef.certTemplateID != -1)
			itemDef.toNote();
		if (!isMembers && itemDef.membersObject) {
            itemDef.name = "Members Object";
            itemDef.description = "Login to a members' server to use this object.".getBytes();
            itemDef.groundActions = null;
            itemDef.itemActions = null;
            itemDef.team = 0;
        }
		/* Customs items  */
switch (i) {
		
		case 13190:
			itemDef.name = "10 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
			
		case 7478:
			itemDef.name = "2 Members Credits";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
			
		case 13191:
			itemDef.name = "100 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
		case 741:
			itemDef.name = "Crystal 1";
			break;	
		case 742:
			itemDef.name = "Crystal 2";
			break;	
		case 743:
			itemDef.name = "Crystal 3";
			break;	
		case 3109:
			itemDef.name = "Impure Crystal";
			break;	

		case 4327:
			itemDef.name = "Max cape";
			itemDef.modelZoom = 2232;
			itemDef.modelRotationY = 687;
			itemDef.modelRotationX = 27;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = 27;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[5];
			itemDef.itemActions[4] = "Drop";
			itemDef.itemActions[3] = "Features";
			itemDef.itemActions[2] = "Teleports";
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 29630;
			itemDef.anInt165 = 29616;
			itemDef.anInt164 = 29624;
			break;
			
		case 2906:
			itemDef.name = "Eternal boots";
			itemDef.modelID = 29394;
			itemDef.modelZoom = 976;
			itemDef.modelRotationY = 147;
			itemDef.modelRotationX = 279;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = -5;
			itemDef.anInt165 = 29249;
			itemDef.anInt164 = 29254;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			break;
			
		case 2902:
			itemDef.name = "Pegasian boots";
			itemDef.modelID = 29396;
			itemDef.modelZoom = 976;
			itemDef.modelRotationY = 147;
			itemDef.modelRotationX = 279;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = -5;
			itemDef.anInt165 = 29252;
			itemDef.anInt164 = 29253;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			break;
			
		case 2904:
			itemDef.name = "Primordial boots";
			itemDef.modelID = 29397;
			itemDef.modelZoom = 976;
			itemDef.modelRotationY = 147;
			itemDef.modelRotationX = 279;
			itemDef.modelOffset1 = 5;
			itemDef.modelOffset2 = -5;
			itemDef.anInt165 = 29250;
			itemDef.anInt164 = 29255;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			break;
			
		case 5000:
			itemDef.name = "Vesta's Chainbody";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 42593;
			itemDef.modelZoom = 1440;
			itemDef.modelRotationY = 545;
			itemDef.modelRotationX = 2;
			itemDef.modelOffset2 = 5;
			itemDef.modelOffset1 = 4;
			itemDef.anInt204 = 0;
			itemDef.anInt165 = 42624;
			itemDef.anInt200 = 42644;
		itemDef.description = "An ancient chainbody once worn by Vesta.".getBytes();
		break;
		case 5001:
			itemDef.name = "Vesta's Plateskirt";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 42581;
			itemDef.modelZoom = 1753;
			itemDef.modelRotationY = 562;
			itemDef.modelRotationX = 1;
			itemDef.modelOffset2 = 11;
			itemDef.modelOffset1 = -3;
			itemDef.anInt204 = 0;
			itemDef.anInt165 = 42633;
			itemDef.anInt200 = 42649;
		itemDef.description = "An ancient plateskirt once worn by Vesta.".getBytes();
		break;
		case 5002:
			itemDef.name = "Vesta's Longsword";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 42597;
			itemDef.modelZoom = 1744;
			itemDef.modelRotationY = 738;
			itemDef.modelRotationX = 1985;
			itemDef.modelOffset2 = 0;
			itemDef.modelOffset1 = 0;
			itemDef.anInt204 = 0;
			itemDef.aByte205 = -12;
			itemDef.aByte154 = 0;
			itemDef.anInt165 = 42615;
			itemDef.anInt200 = 42615;
		itemDef.description = "An ancient longsword once worn by Vesta.".getBytes();
		break;
		case 5003:
			itemDef.name = "Vesta's Spear";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 42599;
			itemDef.modelZoom = 2022;
			itemDef.modelRotationY = 480;
			itemDef.modelRotationX = 15;
			itemDef.anInt204 = 0;
			itemDef.aByte205 = -12;
			itemDef.aByte154 = 0;
			itemDef.modelOffset2 = 5;
			itemDef.modelOffset1 = 0;
			//itemDef.anInt204 = 0;
			itemDef.anInt165 = 42614;
			itemDef.anInt200 = 42614;
		itemDef.description = "An ancient spear once worn by Vesta.".getBytes();
		break;
		
		case 5008:
			itemDef.name = "Statius's Platebody";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 42602;
			itemDef.modelZoom = 1312;
			itemDef.modelRotationY = 272;
			itemDef.modelRotationX = 2047;
			itemDef.modelOffset2 = 39;
			itemDef.modelOffset1 = -2;
			itemDef.anInt204 = 0;
			itemDef.anInt165 = 42625;
			itemDef.anInt200 = 42641;
			itemDef.description = "Statius's Platebody, a reward from PVP."
					.getBytes();
			break;
		case 5009:
			itemDef.name = "Statius's Platelegs";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 42590;
			itemDef.modelZoom = 1625;
			itemDef.modelRotationY = 355;
			itemDef.modelRotationX = 2046;
			itemDef.modelOffset2 = -11;
			itemDef.modelOffset1 = 0;
			itemDef.anInt204 = 0;
			itemDef.anInt165 = 42632;
			itemDef.anInt200 = 42647;
			itemDef.description = "Statius's Platelegs, a reward from PVP."
					.getBytes();
			break;
		case 5010:
			itemDef.name = "Statius's Full Helm";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wear";
			itemDef.modelID = 42596;
			itemDef.modelZoom = 789;
			itemDef.modelRotationY = 96;
			itemDef.modelRotationX = 2039;
			itemDef.modelOffset2 = -7;
			itemDef.modelOffset1 = 2;
			itemDef.anInt204 = 0;
			itemDef.anInt165 = 42639;
			itemDef.anInt200 = 42655;
			itemDef.description = "Statius's Full Helm, a reward from PVP."
					.getBytes();
			break;
		case 5011:
			itemDef.name = "Statius's Warhammer";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wield";
			itemDef.modelID = 42577;
			itemDef.modelZoom = 1360;
			itemDef.modelRotationY = 507;
			itemDef.modelRotationX = 27;
			itemDef.modelOffset2 = 6;
			itemDef.modelOffset1 = 7;
			itemDef.anInt204 = 0;
			itemDef.aByte205 = -12;
			itemDef.aByte154 = 0;
			itemDef.anInt165 = 42623;
			itemDef.anInt200 = 42623;
			itemDef.description = "An ancient warhammer once used by Statius."
					.getBytes();
			break;
			  
		   case 5016:
               itemDef.name = "Divine spirit shield";
               itemDef.modelZoom = 1600;
               itemDef.modelRotationY = 396;
               itemDef.modelRotationX = 1050;
               itemDef.modelOffset1 = 4;
               itemDef.modelOffset2 = 13;
               itemDef.modelID = 40921;
               itemDef.anInt165 = 11047;
               itemDef.anInt200 = 11047;
               break;
			
		case 12773:
			itemDef.name = "Volcanic abyssal whip";
			itemDef.originalModelColors = new int[] { 5056 };
			itemDef.modifiedModelColors = new int[] { 528 };
			break;
			
			
		case 5565:
			itemDef.name = "Toy Penguin";
			break;

			case 4067:
			itemDef.name = "Vote ticket";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			break;
			
			case 9433:
				itemDef.name = "Enchanted bolt pack";
				break;
				
			case 12792:
				itemDef.name = "Dragon bone pack (50)";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				itemDef.itemActions[2] = null;
				break;
				
			case 12641:
				itemDef.name = "Dragon dart pack (50)";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				itemDef.itemActions[2] = null;
				break;
				
			case 12873:
				itemDef.name = "Guthan's armour set";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				break;
				
			case 12881:
				itemDef.name = "Ahrim's armour set";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				break;
				
			case 12875:
				itemDef.name = "Verac's armour set";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				break;
				
			case 12877:
				itemDef.name = "Dharok's armour set";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				break;
				
			case 12879:
				itemDef.name = "Torag's armour set";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				break;
				
			case 12883:
				itemDef.name = "Karil's armour set";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Open";
				break;
			
		case 6645:
			itemDef.name = "Pet Raccoon";
			break;
			
		case 1855:
			itemDef.name = "Pet rockcrab";
			break;
			
		case 4520:
			itemDef.name = "Pet Inadequacy";
			break;
			
		case 7771:
			itemDef.name = "Clockwork cat";
			break;
			
		case 7761:
			itemDef.name = "Toy soldier";
			break;
			
		case 7765:
			itemDef.name = "Toy doll";
			break;
			
		case 7916:
			itemDef.name = "Pet shadow hound";
			break;
			
		case 10115:
			itemDef.name = "Pet evil creature";
			break;
			
		case 10117:
			itemDef.name = "Pet cute creature";
			break;
			
		case 4823:
			itemDef.name = "Pet Goldfish";
			break;
			
		case 4138:
			itemDef.name = "Pet Pyrefiend";
			break;
			
		case 4033:
			itemDef.name = "Baby monkey";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = null;
			break;
			
		case 6653:
			itemDef.name = "Members teleport";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Teleport";
			break;
			
		case 4179:
			itemDef.name = "Pet Broom?";
			break;
			
		case 13071:
			itemDef.name = "Chompy chick";
			break;
			
		case 4140:
			itemDef.name = "Pet infernal mage";
			break;
			
		case 8131:
			itemDef.name = "Pet skeleton warlord";
			break;
			
		case 12359:
			itemDef.name = "Leprechaun follower";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = null;
			break;
			
		case 1583:
			itemDef.name = "Pet phoenix";
			break;
			
		case 7500:
			itemDef.name = "Dwarf follower";
			break;
			
		case 771:
			itemDef.name = "Pet tree spirit";
			break;
			
		case 964:
			itemDef.name = "Spiritual follower";
			break;
			
		case 7986:
			itemDef.name = "Pet abyssal leech";
			break;
			
		case 7769:
			itemDef.name = "Toy Mouse";
			break;
			
		case 553:
			itemDef.name = "Ghostly follower";
			break;
			
		case 11047:
			itemDef.name = "Hell rat";
			break;
			
		case 10998:
			itemDef.name = "Hell goblin";
			break;
			
		case 10731:
			itemDef.name = "Mutant";
			break;
			
		case 8888:
			itemDef.name = "Zanik(HAM)";
			break;
			
		case 8887:
			itemDef.name = "Zanik";
			break;
			
		case 12840:
			itemDef.name = "Soulless one";
			break;
			
		case 5076:
			itemDef.name = "Black swan";
			break;
			
		case 5077:
			itemDef.name = "White swan";
			break;
			
		case 7993:
			itemDef.name = "Pet shark";
			break;
			
		case 9952:
			itemDef.name = "Inslaved Imp";
			break;
			
		case 9970:
			itemDef.name = "Crimson Monarch";
			break;
			
		case 7914:
			itemDef.name = "German Shepard";
			break;
			
		case 8132:
			itemDef.name = "Guard Dog";
			break;
			
		case 9975:
			itemDef.name = "Pet Rabbit";
			break;
			
		case 10149:
			itemDef.name = "Pet salamander";
			break;
			
		case 10146:
			itemDef.name = "Pet salamander";
			break;
			
		case 10147:
			itemDef.name = "Pet salamander";
			break;
			
		case 10148:
			itemDef.name = "Pet salamander";
			break;
			
		case 9976:
			itemDef.name = "Pet chinchompa";
			break;
			
		case 9977:
			itemDef.name = "Pet chinchompa";
			break;
			
		case 11959:
			itemDef.name = "Pet chinchompa";
			break;
			
		case 9957:
			itemDef.name = "Pet kebbit";
			break;
			
		case 10023:
			itemDef.name = "Pet falcon";
			break;
			
		case 12807:
			itemDef.name = "Odium ward (or)";
			break;
			
		case 12806:
			itemDef.name = "Malediction ward (or)";
			break;
			
		case 12797:
			itemDef.name = "Dragon pickaxe (or)";
			break;
			
		case 12848:
			itemDef.name = "Granite maul (or)";
			break;
			
		case 13192:
			itemDef.name = "50 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
			
		case 13193:
			itemDef.name = "80 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
			
		case 13194:
			itemDef.name = "100 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			itemDef.stackable = false;
			break;
			
		case 13195:
			itemDef.name = "200 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
			
		case 13196:
			itemDef.name = "500 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
			
		case 13197:
			itemDef.name = "1,000 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
			
		case 13198:
			itemDef.name = "2,000 Credits bond";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Redeem";
			itemDef.modelID = 29210;
			itemDef.modelZoom = 2300;
			itemDef.modelRotationY = 512;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = 1;
			break;
		
	case 995://Money
		itemDef.name = "Coins";
		itemDef.itemActions = new String[5];
		itemDef.itemActions[4] = "Drop";
		itemDef.itemActions[3] = "Add-to-pouch";				
		break;
		
	case 12690://Armour sets
	case 12962:
	case 12972:
	case 12974:
	case 12984:
	case 12986:
	case 12988:
	case 12990:
	case 13000:
	case 13002:
	case 13012:
	case 13014:
	case 13024:
	case 13026:
	case 9666:
	case 9670:
	case 12865:
	case 12867:
	case 12869:
	case 12871:
	case 12966:
	case 12964:
	case 12968:
	case 12970:
	case 12976:
	case 12978:
	case 12980:
	case 12982:
	case 12992:
	case 12994:
	case 12996:
	case 12998:
	case 13004:
	case 13006:
	case 13008:
	case 13010:
	case 13016:
	case 13018:
	case 13020:
	case 13022:
	case 13028:
	case 13030:
	case 13032:
	case 13034:
	case 13036:
	case 13038:
	case 12960:
	case 13173:
	case 13175:
		itemDef.itemActions = new String[5];
		itemDef.itemActions[0] = "Unpack";
		break;	
		
	case 1500://iban's shadow
		itemDef.name = "Unknown Mixture";
		itemDef.itemActions = new String[5];
		itemDef.itemActions[1] = "Break";
		break;
		
	case 13111://Wilderness Sword
		itemDef.name = "Blade of the wilderness";
		break;
	
	case 4155://Gem
		itemDef.name = "Slayer gem";
		itemDef.itemActions = new String[5];
		itemDef.itemActions[0] = "Check-task";
		break;
	
	case 2568://Ring of forging
		itemDef.itemActions[2] = "Check charges";
		break;
		
	case 13188:// Dragon claws
		itemDef.name = "Dragon  claws";
		break;
		}
		
		if (itemDef.certTemplateID != -1)
			itemDef.toNote();
		return itemDef;
	}


	public static void nullLoader() {
		mruNodes2 = null;
		mruNodes1 = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public boolean method192(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		return flag;
	}

	public static void unpackConfig(StreamLoader archive) {
		//stream = new Stream(archive.getDataForName("obj.dat"));
		//Stream stream = new Stream(archive.getDataForName("obj.idx"));
		stream = new Stream(FileOperations.ReadFile(Signlink.findcachedir()+ "obj.dat"));
		Stream stream = new Stream(FileOperations.ReadFile(Signlink.findcachedir()+ "obj.idx"));
		totalItems = stream.readUnsignedWord() + 21;
		System.out.println("Items Loaded: "+totalItems);
		streamIndices = new int[totalItems + 50000];
		int i = 2;
		for (int j = 0; j < totalItems - 21; j++) {
			streamIndices[j] = i;
			i += stream.readUnsignedWord();
		}

		cache = new ItemDef[10];
		for (int k = 0; k < 10; k++)
			cache[k] = new ItemDef();

	}

	public Model method194(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return null;
		Model model = Model.method462(k);
		if (l != -1) {
			Model model_1 = Model.method462(l);
			Model aclass30_sub2_sub4_sub6s[] = { model, model_1 };
			model = new Model(2, aclass30_sub2_sub4_sub6s);
		}
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < modifiedModelColors.length; i1++)
				model.method476(modifiedModelColors[i1],
						originalModelColors[i1]);

		}
		return model;
	}

	public boolean method195(int j) {
		int k = anInt165;
		int l = anInt188;
		int i1 = anInt185;
		if (j == 1) {
			k = anInt200;
			l = anInt164;
			i1 = anInt162;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		if (i1 != -1 && !Model.method463(i1))
			flag = false;
		return flag;
	}

	public Model method196(int i) {
		int j = anInt165;
		int k = anInt188;
		int l = anInt185;
		if (i == 1) {
			j = anInt200;
			k = anInt164;
			l = anInt162;
		}
		if (j == -1)
			return null;
		Model model = Model.method462(j);
		if (k != -1)
			if (l != -1) {
				Model model_1 = Model.method462(k);
				Model model_3 = Model.method462(l);
				Model aclass30_sub2_sub4_sub6_1s[] = { model, model_1, model_3 };
				model = new Model(3, aclass30_sub2_sub4_sub6_1s);
			} else {
				Model model_2 = Model.method462(k);
				Model aclass30_sub2_sub4_sub6s[] = { model, model_2 };
				model = new Model(2, aclass30_sub2_sub4_sub6s);
			}
		if (i == 0 && aByte205 != 0)
			model.method475(0, aByte205, 0);
		if (i == 1 && aByte154 != 0)
			model.method475(0, aByte154, 0);
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < modifiedModelColors.length; i1++)
				model.method476(modifiedModelColors[i1], originalModelColors[i1]);

		}
		return model;
	}

	private void setDefaults() {
		modelID = 0;
		name = null;
		description = null;
		modifiedModelColors = null;
		originalModelColors = null;
		modelZoom = 2000;
		modelRotationY = 0;
		modelRotationX = 0;
		anInt204 = 0;
		modelOffset1 = 0;
		modelOffset2 = 0;
		stackable = false;
		value = 1;
		membersObject = false;
		groundActions = null;
		itemActions = null;
		anInt165 = -1;
		anInt188 = -1;
		aByte205 = 0;
		anInt200 = -1;
		anInt164 = -1;
		aByte154 = 0;
		anInt185 = -1;
		anInt162 = -1;
		anInt175 = -1;
		anInt166 = -1;
		anInt197 = -1;
		anInt173 = -1;
		stackIDs = null;
		stackAmounts = null;
		certID = -1;
		certTemplateID = -1;
		anInt167 = 128;
		anInt192 = 128;
		anInt191 = 128;
		anInt196 = 0;
		anInt184 = 0;
		team = 0;
	}


	private void toNote() {
		ItemDef itemDef = forID(certTemplateID);
		modelID = itemDef.modelID;
		modelZoom = itemDef.modelZoom;
		modelRotationY = itemDef.modelRotationY;
		modelRotationX = itemDef.modelRotationX;

		anInt204 = itemDef.anInt204;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		modifiedModelColors = itemDef.modifiedModelColors;
		originalModelColors = itemDef.originalModelColors;
		ItemDef itemDef_1 = forID(certID);
		name = itemDef_1.name;
		membersObject = itemDef_1.membersObject;
		value = itemDef_1.value;
		String s = "a";
		char c = itemDef_1.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			s = "an";
		description = ("Swap this note at any bank for " + s + " " + itemDef_1.name + ".").getBytes();
		stackable = true;
	}
	
	public static Sprite getSprite(int id, int size, int color, int zoom) {
		if (id == 0) {
			return Client.cacheSprite[326];
		}
		ItemDef item = forID(id);
		if(item.stackIDs == null) {
			size = -1;
		}
		if(size > 1) {
			int i1 = -1;
			for(int j1 = 0; j1 < 10; j1++) {
				if(size >= item.stackAmounts[j1] && item.stackAmounts[j1] != 0) {
					i1 = item.stackIDs[j1];
				}
			}
			if(i1 != -1) {
				item = forID(i1);
			}
		}
		Model model = item.method201(1);
		if(model == null)
			return null;
		Sprite image = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.anIntArray1472;
		int ai1[] = DrawingArea.pixels;
		float depthBuffer[] = DrawingArea.depthBuffer;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, image.myPixels, new float[32*32]);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Rasterizer.method364();
		int itemZoom = item.modelZoom * zoom - 500;
		int l3 = Rasterizer.anIntArray1470[item.modelRotationY] * itemZoom >> 16;
		int i4 = Rasterizer.anIntArray1471[item.modelRotationY] * itemZoom >> 16;
		model.method482(item.modelRotationX, item.anInt204, item.modelRotationY, item.modelOffset1, l3 + model.modelHeight / 2 + item.modelOffset2, i4 + item.modelOffset2);
		if(color == 0) {
			for(int index = 31; index >= 0; index--) {
				for(int index2 = 31; index2 >= 0; index2--)
					if(image.myPixels[index + index2 * 32] == 0 && index > 0 && index2 > 0 && image.myPixels[(index - 1) + (index2 - 1) * 32] > 0)
						image.myPixels[index + index2 * 32] = 0x302020;
			}
		}
		DrawingArea.initDrawingArea(j2, i2, ai1, depthBuffer);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.anIntArray1472 = ai;
		Rasterizer.aBoolean1464 = true;
		if (item.stackable) {
			image.cropWidth = 33;
		} else {
			image.cropWidth = 32;
		}
		image.anInt1445 = size;

		return image;
	}
	
	/*public static Sprite getSprite(int i, int j, int k) {
		if (k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if (sprite != null && sprite.anInt1445 != j && sprite.anInt1445 != -1) {
				
				sprite.unlink();
				sprite = null;
			}
			if (sprite != null) {
				return sprite;
			}
		}
		ItemDef itemDef = forID(i);
		if (itemDef.stackIDs == null)
			j = -1;
		if (j > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++)
				if (j >= itemDef.stackAmounts[j1]
						&& itemDef.stackAmounts[j1] != 0)
					i1 = itemDef.stackIDs[j1];

			if (i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.method201(1);
		if (model == null)
			return null;
		Sprite sprite = null;
		if (itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if (sprite == null)
				return null;
		}
		Sprite enabledSprite = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.anIntArray1472;
		int ai1[] = DrawingArea.pixels;
		float depthBuffer[] = DrawingArea.depthBuffer;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, enabledSprite.myPixels, new float[32*32]);
		DrawingArea.method336(32, 0, 0, 0, 32);
		Rasterizer.method364();
		int k3 = itemDef.modelZoom;
		if (k == -1)
			k3 = (int) ((double) k3 * 1.5D);
		if (k > 0)
			k3 = (int) ((double) k3 * 1.04D);
		int l3 = Rasterizer.anIntArray1470[itemDef.modelRotationY] * k3 >> 16;
		int i4 = Rasterizer.anIntArray1471[itemDef.modelRotationY] * k3 >> 16;
		model.method482(itemDef.modelRotationX, itemDef.anInt204,
				itemDef.modelRotationY, itemDef.modelOffset1, l3
						+ model.modelHeight / 2 + itemDef.modelOffset2, i4
						+ itemDef.modelOffset2);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--)
				if (enabledSprite.myPixels[i5 + j4 * 32] == 0)
					if (i5 > 0
							&& enabledSprite.myPixels[(i5 - 1) + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 > 0
							&& enabledSprite.myPixels[i5 + (j4 - 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (i5 < 31
							&& enabledSprite.myPixels[i5 + 1 + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 < 31
							&& enabledSprite.myPixels[i5 + (j4 + 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;

		}

		if (k > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--)
					if (enabledSprite.myPixels[j5 + k4 * 32] == 0)
						if (j5 > 0
								&& enabledSprite.myPixels[(j5 - 1) + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 > 0
								&& enabledSprite.myPixels[j5 + (k4 - 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (j5 < 31
								&& enabledSprite.myPixels[j5 + 1 + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 < 31
								&& enabledSprite.myPixels[j5 + (k4 + 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;

			}

		} else if (k == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--)
					if (enabledSprite.myPixels[k5 + l4 * 32] == 0
							&& k5 > 0
							&& l4 > 0
							&& enabledSprite.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						enabledSprite.myPixels[k5 + l4 * 32] = 0x302020;

			}

		}
		if (itemDef.certTemplateID != -1) {
			int l5 = sprite.cropWidth;
			int j6 = sprite.anInt1445;
			sprite.cropWidth = 32;
			sprite.anInt1445 = 32;
			sprite.drawSprite(0, 0);
			sprite.cropWidth = l5;
			sprite.anInt1445 = j6;
		}
		if (k == 0)
			mruNodes1.removeFromCache(enabledSprite, i);
		DrawingArea.initDrawingArea(j2, i2, ai1, depthBuffer);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.anIntArray1472 = ai;
		Rasterizer.aBoolean1464 = true;
		if (itemDef.stackable)
			enabledSprite.cropWidth = 33;
		else
			enabledSprite.cropWidth = 32;
		enabledSprite.anInt1445 = j;
		return enabledSprite;
		} 
	}*/
	
	public static Sprite getSprite(int i, int j, int k) {
		if (k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if (sprite != null && sprite.anInt1445 != j
					&& sprite.anInt1445 != -1) {

				sprite.unlink();
				sprite = null;
			}
			if (sprite != null)
				return sprite;
		}
		ItemDef itemDef = forID(i);
		if (itemDef.stackIDs == null)
			j = -1;
		if (j > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++)
				if (j >= itemDef.stackAmounts[j1]
						&& itemDef.stackAmounts[j1] != 0)
					i1 = itemDef.stackIDs[j1];

			if (i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.method201(1);
		if (model == null)
			return null;
		Sprite sprite = null;
		if (itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if (sprite == null)
				return null;
		}
		Sprite enabledSprite = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.anIntArray1472;
		int ai1[] = DrawingArea.pixels;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		float depthBuffer[] = DrawingArea.depthBuffer;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, enabledSprite.myPixels, new float[32*32]);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Rasterizer.method364();
		int k3 = itemDef.modelZoom;
		if (k == -1)
			k3 = (int) ((double) k3 * 1.5D);
		if (k > 0)
			k3 = (int) ((double) k3 * 1.04D);
		int l3 = Rasterizer.anIntArray1470[itemDef.modelRotationY] * k3 >> 16;
		int i4 = Rasterizer.anIntArray1471[itemDef.modelRotationY] * k3 >> 16;
		model.method482(itemDef.modelRotationX, itemDef.anInt204,
				itemDef.modelRotationY, itemDef.modelOffset1, l3
						+ model.modelHeight / 2 + itemDef.modelOffset2, i4
						+ itemDef.modelOffset2);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--)
				if (enabledSprite.myPixels[i5 + j4 * 32] == 0)
					if (i5 > 0
							&& enabledSprite.myPixels[(i5 - 1) + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 > 0
							&& enabledSprite.myPixels[i5 + (j4 - 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (i5 < 31
							&& enabledSprite.myPixels[i5 + 1 + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 < 31
							&& enabledSprite.myPixels[i5 + (j4 + 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;

		}

		if (k > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--)
					if (enabledSprite.myPixels[j5 + k4 * 32] == 0)
						if (j5 > 0
								&& enabledSprite.myPixels[(j5 - 1) + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 > 0
								&& enabledSprite.myPixels[j5 + (k4 - 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (j5 < 31
								&& enabledSprite.myPixels[j5 + 1 + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 < 31
								&& enabledSprite.myPixels[j5 + (k4 + 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;

			}

		} else if (k == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--)
					if (enabledSprite.myPixels[k5 + l4 * 32] == 0
							&& k5 > 0
							&& l4 > 0
							&& enabledSprite.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						enabledSprite.myPixels[k5 + l4 * 32] = 0x302020;

			}

		}
		if (itemDef.certTemplateID != -1) {
			int l5 = sprite.cropWidth;
			int j6 = sprite.anInt1445;
			sprite.cropWidth = 32;
			sprite.anInt1445 = 32;
			sprite.drawSprite(0, 0);
			sprite.cropWidth = l5;
			sprite.anInt1445 = j6;
		}
		if (k == 0)
			mruNodes1.removeFromCache(enabledSprite, i);
		DrawingArea.initDrawingArea(j2, i2, ai1, depthBuffer);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.anIntArray1472 = ai;
		Rasterizer.aBoolean1464 = true;
		if (itemDef.stackable)
			enabledSprite.cropWidth = 33;
		else
			enabledSprite.cropWidth = 32;
		enabledSprite.anInt1445 = j;
		return enabledSprite;
	}

	public Model method201(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];

			if (j != -1)
				return forID(j).method201(1);
		}
		Model model = (Model) mruNodes2.insertFromCache(id);
		if (model != null)
			return model;
		model = Model.method462(modelID);
		if (model == null)
			return null;
		if (anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (modifiedModelColors != null) {
			for (int l = 0; l < modifiedModelColors.length; l++)
				model.method476(modifiedModelColors[l], originalModelColors[l]);

		}
		model.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, id);
		return model;
	}

	public Model method202(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];

			if (j != -1)
				return forID(j).method202(1);
		}
		Model model = Model.method462(modelID);
		if (model == null)
			return null;
		if (modifiedModelColors != null) {
			for (int l = 0; l < modifiedModelColors.length; l++)
				model.method476(modifiedModelColors[l], originalModelColors[l]);

		}
		return model;
	}
		
	/*private void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1)
				modelID = stream.readUnsignedWord();
			else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readBytes();
			else if (i == 4)
				modelZoom = stream.readUnsignedWord();
			else if (i == 5)
				modelRotationY = stream.readUnsignedWord();
			else if (i == 6)
				modelRotationX = stream.readUnsignedWord();
			else if (i == 7) {
				modelOffset1 = stream.readUnsignedWord();
				if (modelOffset1 > 32767)
					modelOffset1 -= 0x10000;
			} else if (i == 8) {
				modelOffset2 = stream.readUnsignedWord();
				if (modelOffset2 > 32767)
					modelOffset2 -= 0x10000;
			} else if (i == 10)
				stream.readUnsignedWord();
			else if (i == 11)
				stackable = true;
			else if (i == 12)
				value = stream.readDWord();
			else if (i == 16)
				membersObject = true;
			else if (i == 23) {
				anInt165 = stream.readUnsignedWord();
				aByte205 = stream.readSignedByte();
			} else if (i == 24)
				anInt188 = stream.readUnsignedWord();
			else if (i == 25) {
				anInt200 = stream.readUnsignedWord();
				aByte154 = stream.readSignedByte();
			} else if (i == 26)
				anInt164 = stream.readUnsignedWord();
			else if (i >= 30 && i < 35) {
				if (groundActions == null)
					groundActions = new String[5];
				groundActions[i - 30] = stream.readString();
				if (groundActions[i - 30].equalsIgnoreCase("hidden"))
					groundActions[i - 30] = null;
			} else if (i >= 35 && i < 40) {
				if (itemActions == null)
					itemActions = new String[5];
				itemActions[i - 35] = stream.readString();
			} else if (i == 40) {
				int j = stream.readUnsignedByte();
				originalModelColors = new int[j];
				modifiedModelColors = new int[j];
				for (int k = 0; k < j; k++) {
					originalModelColors[k] = stream.readUnsignedWord();
					modifiedModelColors[k] = stream.readUnsignedWord();
				}

			} else if (i == 78)
				anInt185 = stream.readUnsignedWord();
			else if (i == 79)
				anInt162 = stream.readUnsignedWord();
			else if (i == 90)
				anInt175 = stream.readUnsignedWord();
			else if (i == 91)
				anInt197 = stream.readUnsignedWord();
			else if (i == 92)
				anInt166 = stream.readUnsignedWord();
			else if (i == 93)
				anInt173 = stream.readUnsignedWord();
			else if (i == 95)
				anInt204 = stream.readUnsignedWord();
			else if (i == 97)
				certID = stream.readUnsignedWord();
			else if (i == 98)
				certTemplateID = stream.readUnsignedWord();
			else if (i == 100) {
				int length = stream.readUnsignedByte();
				stackIDs = new int [length];
				stackAmounts = new int[length];
				for (int i2 = 0; i2< length; i2++) {
					stackIDs[i2] = stream.readUnsignedWord();
					stackAmounts[i2] = stream.readUnsignedWord();
				}
			} else if (i == 110)
				anInt167 = stream.readUnsignedWord();
			else if (i == 111)
				anInt192 = stream.readUnsignedWord();
			else if (i == 112)
				anInt191 = stream.readUnsignedWord();
			else if (i == 113)
				anInt196 = stream.readSignedByte();
			else if (i == 114)
				anInt184 = stream.readSignedByte() * 5;
			else if (i == 115)
				team = stream.readUnsignedByte();
		} while (true);
	}*/
	
	private void readValues(Stream stream) {
		  do {
		   int i = stream.readUnsignedByte();
		   if (i == 0)
		    return;
		   if (i == 1)
		    modelID = stream.readUnsignedWord();
		   else if (i == 2)
		    name = stream.readString();
		   else if (i == 3)
		    description = stream.readBytes();
		   else if (i == 4)
		    modelZoom = stream.readUnsignedWord();
		   else if (i == 5)
		    modelRotationY = stream.readUnsignedWord();
		   else if (i == 6)
		    modelRotationX = stream.readUnsignedWord();
		   else if (i == 7) {
		    modelOffset1 = stream.readUnsignedWord();
		    if (modelOffset1 > 32767)
		     modelOffset1 -= 0x10000;
		   } else if (i == 8) {
		    modelOffset2 = stream.readUnsignedWord();
		    if (modelOffset2 > 32767)
		     modelOffset2 -= 0x10000;
		   } else if (i == 10)
		    stream.readUnsignedWord();
		   else if (i == 11)
		    stackable = true;
		   else if (i == 12)
		    value = stream.readDWord();
		   else if (i == 16)
		    membersObject = true;
		   else if (i == 23) {
		    anInt165 = stream.readUnsignedWord();
		    aByte205 = stream.readSignedByte();
		   } else if (i == 24)
		    anInt188 = stream.readUnsignedWord();
		   else if (i == 25) {
		    anInt200 = stream.readUnsignedWord();
		    aByte154 = stream.readSignedByte();
		   } else if (i == 26)
		    anInt164 = stream.readUnsignedWord();
		   else if (i >= 30 && i < 35) {
		    if (groundActions == null)
		     groundActions = new String[5];
		    groundActions[i - 30] = stream.readString();
		   } else if (i >= 35 && i < 40) {
		    if (itemActions == null)
		     itemActions = new String[5];
		    itemActions[i - 35] = stream.readString();
		   } else if (i == 40) {
		    int j = stream.readUnsignedByte();
		    originalModelColors = new int[j];
		    modifiedModelColors = new int[j];
		    for (int k = 0; k < j; k++) {
		     originalModelColors[k] = stream.readUnsignedWord();
		     modifiedModelColors[k] = stream.readUnsignedWord();
		    }
		   } else if (i == 78)
		    anInt185 = stream.readUnsignedWord();
		   else if (i == 79)
		    anInt162 = stream.readUnsignedWord();
		   else if (i == 90)
		    anInt175 = stream.readUnsignedWord();
		   else if (i == 91)
		    anInt197 = stream.readUnsignedWord();
		   else if (i == 92)
		    anInt166 = stream.readUnsignedWord();
		   else if (i == 93)
		    anInt173 = stream.readUnsignedWord();
		   else if (i == 95)
		    anInt204 = stream.readUnsignedWord();
		   else if (i == 97)
		    certID = stream.readUnsignedWord();
		   else if (i == 98)
		    certTemplateID = stream.readUnsignedWord();
		   else if (i >= 100 && i < 110) {
		    if (stackIDs == null) {
		     stackIDs = new int[10];
		     stackAmounts = new int[10];
		    }
		    stackIDs[i - 100] = stream.readUnsignedWord();
		    stackAmounts[i - 100] = stream.readUnsignedWord();
		   } else if (i == 110)
		    anInt167 = stream.readUnsignedWord();
		   else if (i == 111)
		    anInt192 = stream.readUnsignedWord();
		   else if (i == 112)
		    anInt191 = stream.readUnsignedWord();
		   else if (i == 113)
			   anInt196 = stream.readSignedByte();
		   else if (i == 114)
		    anInt184 = stream.readSignedByte() * 5;
		   else if (i == 115)
		    team = stream.readUnsignedByte();
		  } while (true);
		 }

	private ItemDef() {
		id = -1;
	}

	private byte aByte154;
	public int value;// anInt155
	public int[] modifiedModelColors;// newModelColor
	public int id;// anInt157
	static MRUNodes mruNodes1 = new MRUNodes(100);
	public static MRUNodes mruNodes2 = new MRUNodes(50);
	public int[] originalModelColors;
	public boolean membersObject;// aBoolean161
	private int anInt162;
	public int certTemplateID;
	public int anInt164;// femArmModel
	public int anInt165;// maleWieldModel
	private int anInt166;
	private int anInt167;
	public String groundActions[];
	public int modelOffset1;
	public String name;// itemName
	private static ItemDef[] cache;
	private int anInt173;
	public int modelID;// dropModel
	public int anInt175;
	public boolean stackable;// itemStackable
	public byte[] description;// itemExamine
	public int certID;
	private static int cacheIndex;
	public int modelZoom;
	public static boolean isMembers = true;
	private static Stream stream;
	private int anInt184;
	private int anInt185;
	public int anInt188;// maleArmModel
	public String itemActions[];// itemMenuOption
	public int modelRotationY;// modelRotateUp
	private int anInt191;
	private int anInt192;
	public int[] stackIDs;// modelStack
	public int modelOffset2;//
	private static int[] streamIndices;
	private int anInt196;
	public int anInt197;
	public int modelRotationX;// modelRotateRight
	public int anInt200;// femWieldModel
	public int[] stackAmounts;// itemAmount
	public int team;
	public static int totalItems;
	public int anInt204;// modelPositionUp
	private byte aByte205;

}
