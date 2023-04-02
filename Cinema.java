
public class Cinema {
	
	public Cinema(){}
	
	public float computeTotal(int nbBillet, int sceance, char f)
	{

	    float tarif=0, total=0;
	    
		if (sceance >11 && sceance <24)
		{
			if (nbBillet > 1)
			{
				if (sceance >= 12)
					if (sceance <= 14)
						tarif=5;
					else
						if (sceance <= 20)
							tarif=10;
						else
							tarif=12.5f;
			}
			else
				tarif=12.5f;
			
			total=nbBillet*tarif;

			if (f=='u')
				total+=nbBillet;
		}
		return total;
	}

}
