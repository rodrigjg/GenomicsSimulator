package oldCode;


public class Person {
	TraitsEnum[] allTraits = new TraitsEnum[13];
	String name;
	TraitsEnum gender = TraitsEnum.GENDER;
	TraitsEnum eyeColour = TraitsEnum.EYE_COLOUR;
	TraitsEnum eyeSize = TraitsEnum.EYE_SIZE;
	TraitsEnum height = TraitsEnum.HEIGHT;
	TraitsEnum skinColour = TraitsEnum.SKIN_COLOUR;
	TraitsEnum noseSize = TraitsEnum.NOSE_SIZE;
	TraitsEnum earlobe = TraitsEnum.EARLOBE;
	TraitsEnum hairColour = TraitsEnum.HAIR_COLOUR;
	TraitsEnum hairAmount = TraitsEnum.HAIR_AMOUNT;
	TraitsEnum outlook = TraitsEnum.OUTLOOK;
	TraitsEnum intelligence = TraitsEnum.INTEL;
	public Person(String[] allTraitsAsStrings)  {
		// Set name
			name = allTraitsAsStrings[0];
		// Set gender	
			gender.setCurrentTrait(allTraitsAsStrings[1]);
			allTraits[1] = gender;
		// Set eyeColour
			eyeColour.setCurrentTrait(allTraitsAsStrings[2]);
			allTraits[2] = eyeColour;
		// Set eyeSize
			eyeSize.setCurrentTrait(allTraitsAsStrings[3]);
			allTraits[3] = eyeSize;
		// Set height
			height.setCurrentTrait(allTraitsAsStrings[4]);
			allTraits[4] = height;
		// Set skinColour	
			skinColour.setCurrentTrait(allTraitsAsStrings[6]);
			allTraits[6] = skinColour;
		// Set noseSize
			noseSize.setCurrentTrait(allTraitsAsStrings[7]);
			allTraits[7] = noseSize;
		// Set earlobe	
			earlobe.setCurrentTrait(allTraitsAsStrings[8]);
			allTraits[8] = earlobe;
		// Set hairColour
			hairColour.setCurrentTrait(allTraitsAsStrings[9]);
			allTraits[9] = hairColour;
		// Set hairAmount
			hairAmount.setCurrentTrait(allTraitsAsStrings[10]);
			allTraits[10] = hairAmount;
		// Set outlook
			outlook.setCurrentTrait(allTraitsAsStrings[11]);
			allTraits[11] = outlook;
		// Set intelligence	
			intelligence.setCurrentTrait(allTraitsAsStrings[12]);
			allTraits[12] = intelligence;
	}
	
	public String getName(){
		return name;
	}
	
	public TraitsEnum[] getAllTraits(){
		return allTraits;
	}
	
	public String getGeneticMaterial(){
		return (gender.chooseRandomGene()
				+eyeColour.chooseRandomGene()
				+eyeSize.chooseRandomGene()
				+height.chooseRandomGene()
				+skinColour.chooseRandomGene()
				+noseSize.chooseRandomGene()
				+earlobe.chooseRandomGene()
				+hairColour.chooseRandomGene()
				+hairAmount.chooseRandomGene()
				+outlook.chooseRandomGene()
				+intelligence.chooseRandomGene()
				);
	}
}
