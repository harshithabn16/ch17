//Asignmenet 17 :

class CountryRunner {
public static void main(String[] args)
{
System.out.println("The main method runs in CountryRunner");
System.out.println("--------------------------------------------------------------");

String[] stateName={"Maharashtra","Bihar","Arunachal Pradesh","Assam","Manipur","Gujarat","Haryana","Himachal Pradesh","Chhattisgarh","Karnataka","Kerala","Rajasthan","Punjab",
"Madhya Pradesh","Nagaland","Odisha","Mizoram","Tamil Nadu","Andhra Pradesh","Jharkhand","Delhi","Goa","West Bengal","Uttar Pradesh","Telangana","Meghalaya","Sikkim","Uttarkhan","Tripura","Jammu and Kashmir"};

Country.search(stateName);
int name=stateName.length;
System.out.println("State length is: "+name);

System.out.println("--------------------------------------------------------------");


int[] pincodeOfAddress={591214,591215,591263,591216,591247,591201,591217,591287,591228};
	
       Country.find( pincodeOfAddress);
	  int pincode=pincodeOfAddress.length;
	  System.out.println("The pincode length is : "+pincode);
	   
	   
	   System.out.println("--------------------------------------------------------");
	   
	 String[] primeMinisters={"Jawahar Lal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai","Charan Singh",
	   "Rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda",
	 "Dr. Manmohan   Singh","Narendra Damodardas Modi"};
	   Country.tell(primeMinisters);
	   int total=primeMinisters.length;
	   System.out.println("The lengthof primeMinisters is : "+total);
	   System.out.println("--------------------------------------------------------");
	   
	   
	 String[] indianMiniters={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin Jairam Gadkari","Smt. Nirmala Sitharaman","Shri Shivraj Singh Chouhan",
	   "Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri H. D. Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan",
	   "Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi",
	   "Shri Jual Oram","Shri Giriraj Singh","shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Gajendra Singh Shekhawat",
	   "Smt. Annpurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};

	 
         Country.say(indianMiniters);
		 int minister=indianMiniters.length;
		 System.out.println("The total Ministers is : "+minister);
		 
		 System.out.println("----------------------------------------------------------");
		 
		 
		 
		 String[] indianParties={"Aam Aadmi Party","Bahujan Samaj Party","Bharatiya Janata Party","Communist Party Of India","Indian National Congress"};

		 Country.elect(indianParties);

		 int parties=indianParties.length;
		 System.out.println("The total IndianParties is : "+parties);
		 
		 
		 
}
}
