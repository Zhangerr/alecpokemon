package pokemonalecversion;
import java.awt.Image;
import java.awt.Toolkit;

public class Items  {

	private byte itemnumber;
	private byte itemType;
	private String itemName;
	private String itemDescription;
	private boolean inBattle;
        private short AmountOwned;
        private Image itemIcon;
	
    public Items(int i) {
    	itemnumber = (byte) i;
    }
    
    public void create(int i, int a) {
    	itemnumber = (byte) i;
        AmountOwned = (short) a;
    }
    public int getAmount(){
        return AmountOwned;
    }
    
    public Image getIcon() {
       if (itemnumber == 0) {
    		itemIcon = null;
        
         //Status Potions
                
    	} else if (itemnumber == 1) {
    		itemIcon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/potion.png"));
    	} else if (itemnumber == 2) {
    		itemIcon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/superpotion.png"));
        } else if (itemnumber == 3) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/hyperpotion.png"));
        } else if (itemnumber == 4) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/maxpotion.png"));
    	} else if (itemnumber == 5) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/revive.png"));
        } else if (itemnumber == 6) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/maxrevive.png"));
        } else if (itemnumber == 7) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/iceheal.png"));
    	} else if (itemnumber == 8) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/burnheal.png"));
    	} else if (itemnumber == 9) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/awakening.png"));
    	} else if (itemnumber == 10) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/Antidote.png"));
    	} else if (itemnumber == 11) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/parlyzheal.png"));
    	} else if (itemnumber == 12) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/fullheal.png"));
    	}  else if (itemnumber == 13) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/fullrestore.png"));
    	}  else if (itemnumber == 14) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/carbos.png"));
    	} else if (itemnumber == 15) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/iron.png"));
    	} else if (itemnumber == 16) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/protein.png"));
    	} else if (itemnumber == 17) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/calcium.png"));
    	} else if (itemnumber == 18) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/zinc.png"));
    	} else if (itemnumber == 19) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/hpup.png"));
    	} else if (itemnumber == 20) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/rarecandy.png"));
    	}  
        
        //Holdable items
        
        else if (itemnumber == 21) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/moonstone.png"));
    	} else if (itemnumber == 22) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/firestone.png"));
    	} else if (itemnumber == 23) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/thunderstone.png"));
    	} else if (itemnumber == 24) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/leafstone.png"));
    	} else if (itemnumber == 25) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/waterstone.png"));
    	} else if (itemnumber == 26) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/direhit.png"));
    	} else if (itemnumber == 27) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/guardspec.png"));
    	} else if (itemnumber == 28) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/xaccuracy.png"));
    	} else if (itemnumber == 29) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/xspeed.png"));
    	} else if (itemnumber == 30) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/xattack.png"));
    	} else if (itemnumber == 31) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/xdefend.png"));
    	} else if (itemnumber == 32) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/xspecial.png"));
    	}
        
        // Balls
        
         else if (itemnumber == 33) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/pokeball.png"));
    	} else if (itemnumber == 34) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/greatball.png"));
    	} else if (itemnumber == 35) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/ultraball.png"));
    	} else if (itemnumber == 36) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/masterball.png"));
    	}
        
        //Tools
        
         else if (itemnumber == 37) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/PickAxe.png"));
    	} else if (itemnumber == 38) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/oldrod.png"));
    	} else if (itemnumber == 39) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/goodrod.png"));
    	} else if (itemnumber == 40) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/superrod.png"));
    	} else if (itemnumber == 41) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/machete.png"));
    	} else if (itemnumber == 42) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/gun.png"));
    	}else if (itemnumber == 43) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/Repel.png"));
    	} else if (itemnumber == 44) {
    		itemIcon= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Graphics/Items/key.png"));
    	}
        
        return itemIcon;
    }
    
    public String getItemName() {
    	if (itemnumber == 0) {
    		itemName = "";
        
         //Status Potions
                
    	} else if (itemnumber == 1) {
    		itemName = "Potion";
    	} else if (itemnumber == 2) {
    		itemName = "Super Potion";
        } else if (itemnumber == 3) {
    		itemName = "Hyper Potion";
        } else if (itemnumber == 4) {
    		itemName = "Max Potion";
    	} else if (itemnumber == 5) {
    		itemName = "Revive";
        } else if (itemnumber == 6) {
    		itemName = "Max Revive";
        } else if (itemnumber == 7) {
    		itemName = "Ice Heal";
    	} else if (itemnumber == 8) {
    		itemName = "Burn Heal";
    	} else if (itemnumber == 9) {
    		itemName = "Awakening";
    	} else if (itemnumber == 10) {
    		itemName = "Antidote";
    	} else if (itemnumber == 11) {
    		itemName = "Paralysis Heal";
    	} else if (itemnumber == 12) {
    		itemName = "Full Heal";
    	}  else if (itemnumber == 13) {
    		itemName = "Full Restore";
    	}  else if (itemnumber == 14) {
    		itemName = "Carbos";
    	} else if (itemnumber == 15) {
    		itemName = "Iron";
    	} else if (itemnumber == 16) {
    		itemName = "Protien";
    	} else if (itemnumber == 17) {
    		itemName = "Calcium";
    	} else if (itemnumber == 18) {
    		itemName = "Zinc";
    	} else if (itemnumber == 19) {
    		itemName = "HP Up";
    	} else if (itemnumber == 20) {
    		itemName = "Rare Candy";
    	}  
        
        //Holdable items
        
        else if (itemnumber == 21) {
    		itemName = "Moon Stone";
    	} else if (itemnumber == 22) {
    		itemName = "Fire Stone";
    	} else if (itemnumber == 23) {
    		itemName = "Thunder Stone";
    	} else if (itemnumber == 24) {
    		itemName = "Leaf Stone";
    	} else if (itemnumber == 25) {
    		itemName = "Water Stone";
    	} else if (itemnumber == 26) {
    		itemName = "Dire Hit";
    	} else if (itemnumber == 27) {
    		itemName = "Gaurd Special";
    	} else if (itemnumber == 28) {
    		itemName = "X Accuracy";
    	} else if (itemnumber == 29) {
    		itemName = "X Speed";
    	} else if (itemnumber == 30) {
    		itemName = "X Attack";
    	} else if (itemnumber == 31) {
    		itemName = "X Deffend";
    	} else if (itemnumber == 32) {
    		itemName = "X Special";
    	}
        
        // Balls
        
         else if (itemnumber == 33) {
    		itemName = "Poke Ball";
    	} else if (itemnumber == 34) {
    		itemName = "Great Ball";
    	} else if (itemnumber == 35) {
    		itemName = "Ultra Ball";
    	} else if (itemnumber == 36) {
    		itemName = "Master Ball";
    	}
        
        //Tools
        
         else if (itemnumber == 37) {
    		itemName = "Pick Axe";
    	} else if (itemnumber == 38) {
    		itemName = "Old Rod";
    	} else if (itemnumber == 39) {
    		itemName = "Good Rod";
    	} else if (itemnumber == 40) {
    		itemName = "Super Rod";
    	} else if (itemnumber == 41) {
    		itemName = "Machete";
    	} else if (itemnumber == 42) {
    		itemName = "Gun";
    	}else if (itemnumber == 43) {
    		itemName = "Repel";
    	} else if (itemnumber == 44) {
    		itemName = "Key";
    	}
        
        return itemName;
    }
    
    public String getItemDescription() {
if (itemnumber == 0) {
    		itemDescription = "You have no items in this category.";
        
         //Status Potions
                
    	} else if (itemnumber == 1) {
    		itemDescription = "Heals up to 20 HP";
    	} else if (itemnumber == 2) {
    		itemDescription = "Heals up to 50 HP";
        } else if (itemnumber == 3) {
    		itemDescription = "Heals up to 200 HP";
        } else if (itemnumber == 4) {
    		itemDescription = "Complete HP Recovery!";
    	} else if (itemnumber == 5) {
    		itemDescription = "Makes your Pokemon into a Zombie!";
        } else if (itemnumber == 6) {
    		itemDescription = "Makes your Pokemon Jesus!";
        } else if (itemnumber == 7) {
    		itemDescription = "Derp";
    	} else if (itemnumber == 8) {
    		itemDescription = "Derp";
    	} else if (itemnumber == 9) {
    		itemDescription = "Derp";
    	} else if (itemnumber == 10) {
    		itemDescription = "Derp";
    	} else if (itemnumber == 11) {
    		itemDescription = "Derp";
    	} else if (itemnumber == 12) {
    		itemDescription = "Heal all status problems";
    	}  else if (itemnumber == 13) {
    		itemDescription = "Its like Notin' Even Happend";
    	}  else if (itemnumber == 14) {
    		itemDescription = "Permanently Raises Your Pokemon's Speed";
    	} else if (itemnumber == 15) {
    		itemDescription = "Permanently Raises Your Pokemon's Defense";
    	} else if (itemnumber == 16) {
    		itemDescription = "Permanently Raises Your Pokemon's Attack";
    	} else if (itemnumber == 17) {
    		itemDescription = "Permanently Raises Your Pokemon's \nSpecial Attack";
    	} else if (itemnumber == 18) {
    		itemDescription = "Permanently Raises Your Pokemon's \nSpecial Defense";
    	} else if (itemnumber == 19) {
    		itemDescription = "Permanently Raises Your Pokemon's Base Health";
    	} else if (itemnumber == 20) {
    		itemDescription = "level++; we all coderz right?";
    	}
        
        //Holdable items
        
        else if (itemnumber == 21) {
    		itemDescription = "Makes your pokemon moon you";
    	} else if (itemnumber == 22) {
    		itemDescription = "Boosts FIRE Type Moves; Makes Some Pokemon Evolve";
    	} else if (itemnumber == 23) {
    		itemDescription = "Boosts ELECTRIC Type Moves; Makes Some Pokemon Evolve";
    	} else if (itemnumber == 24) {
    		itemDescription = "Boosts GRASS Type Moves; Makes Some Pokemon Evolve";
    	} else if (itemnumber == 25) {
    		itemDescription = "Boosts WATER Type Moves; Makes Some Pokemon Evolve";
    	} else if (itemnumber == 26) {
    		itemDescription = "Increases Critical Hit Probability";
    	} else if (itemnumber == 27) {
    		itemDescription = "Makes the enemy pokemon gay";
    	} else if (itemnumber == 28) {
    		itemDescription = "Boosts the ACCURACY of its Holder";
    	} else if (itemnumber == 29) {
    		itemDescription = "Boosts the SPEED of its Holder";
    	} else if (itemnumber == 30) {
    		itemDescription = "Boosts the ATTACK of its Holder";
    	} else if (itemnumber == 31) {
    		itemDescription = "Boosts the DEFFENSE of its Holder";
    	} else if (itemnumber == 32) {
    		itemDescription = "Boosts the SPECIAL stats of its Holder";
    	}
        
        // Balls
        
         else if (itemnumber == 33) {
    		itemDescription = "Crapy Pokemon Catching Device";
    	} else if (itemnumber == 34) {
    		itemDescription = "Decent Pokemon Catching Device";
    	} else if (itemnumber == 35) {
    		itemDescription = "The Ultimate Pokemon Catching Device!";
    	} else if (itemnumber == 36) {
    		itemDescription = "Good for Catchin Pidgey, bout it";
        }
        
        //Tools
        
         else if (itemnumber == 37) {
    		itemDescription = "Can break weaker rocks";
    	} else if (itemnumber == 38) {
    		itemDescription = "Crap Fishing Rod";
    	} else if (itemnumber == 39) {
    		itemDescription = "A Nice Fishing Rod";
    	} else if (itemnumber == 40) {
    		itemDescription = "An amazing fishing rod";
    	} else if (itemnumber == 41) {
    		itemDescription = "HACK HACK SLASH";
    	} else if (itemnumber == 42) {
    		itemDescription = "BANG! *fainted* 'BS!'";
    	}else if (itemnumber == 43) {
    		itemDescription = "This shit smells really bad!";
    	} else if (itemnumber == 44) {
    		itemDescription = "Opens ...";
    	}
return itemDescription;
    }
    
    public int getItemType() {
        
    	//Status Potions
        if (itemnumber <= 20 ) {
    		itemType = 0;
    	}
        
        //Holdable items
        else if (itemnumber <= 32) {
    		itemType = 1;
    	} 
        
        // Balls
        else if (itemnumber <= 36) {
    		itemType = 2;
    	}
        
        //Tools
        else if (itemnumber > 36) {
    		itemType = 3;
    	}
        
        return itemType;
    }
    
    public boolean isItemUsableInBattle() {      
    	if (itemnumber <= 13) {
    		inBattle = true;
    	}  else if (itemnumber >= 14 && itemnumber <=32) {
    		inBattle = false;
    	} else if (itemnumber == 33 || itemnumber == 34 ||
                  itemnumber == 35 || itemnumber == 36) {
    		inBattle = true;
    	} else {
    		inBattle = false;
    	} 
        return inBattle;
    }
    
    public void setAmount(int i){
        AmountOwned = (short) i;
    }
    public void usedOne(){
        AmountOwned--;
    }
    public int getItemNum(){
        return itemnumber;
    }
    public void addOne(){
        AmountOwned++;
    }
}
