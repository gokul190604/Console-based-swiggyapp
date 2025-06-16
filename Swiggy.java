import java.util.*;

class Swiggy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Swiggy");
        System.out.println("1.Buhari");
        System.out.println("2.A2B");
        System.out.println("3.Billal");
        System.out.println("4.Amma Hotel");
        System.out.println("Select The Hotel");
        int hotel_selection = sc.nextInt();
        System.out.println("Processing....");
        Thread.sleep(2000);

        switch (hotel_selection) {
            case 1: {
                System.out.println("Greeting From Buhari");
                System.out.println("Select The Menu");
                System.out.println("1.Mutton biriyani\n2.Chicken biriyani \n3.Prawn biriyani");
                int buhari_selection = sc.nextInt();
                switch (buhari_selection) {
                    case 1: {
                        int price = 380;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 2: {
                        int price = 280;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 3: {
                        int price = 350;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Greeting From A2B");
                System.out.println("Select The Menu");
                System.out.println("1.Idli\n2.Vada \n3.Pongal");
                int A2B_selection= sc.nextInt();
				switch (A2B_selection) {
                    case 1: {
                        int price = 500;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 2: {
                        int price = 100;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 3: {
                        int price = 150;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
                break;
               
            }
            case 3: {
                System.out.println("Greeting From Billal Hotel");
                System.out.println("Select The Menu");
                System.out.println("1.Mutton biriyani\n2.Chicken biriyani \n3.Prawn biriyani");
				int Billal_HotelSelection=sc.nextInt();
                switch (Billal_HotelSelection) {
                    case 1: {
                        int price = 350;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 2: {
                        int price = 230;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 3: {
                        int price = 250;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
                break;
            }
            case 4: {
                System.out.println("Greeting From Amma Hotel");
                System.out.println("Select The Menu");
                System.out.println("1.Idli\n2.Vada \n3.Pongal");
				int Amma_hotel=sc.nextInt();
                switch (Amma_hotel) {
                    case 1: {
                        int price = 60;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 2: {
                        int price = 50;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    case 3: {
                        int price = 100;
                        System.out.println("Enter the Quantity:");
                        int qty = sc.nextInt();
                        int tot_bill = price * qty;
                        System.out.println("The Total Bill Was :" + tot_bill);
                        System.out.println("Select The Payment Mode");
                        System.out.println("1.Gpay\n2.PhonePe\n3.PayTM");
                        int payment_mode = sc.nextInt();
                        int Sec_Pin = 9025;
                        System.out.println("Enter the Pin:");
                        int user_pin = sc.nextInt();
                        if (Sec_Pin == user_pin) {
                            System.out.println("Enter the Bill Amount :" + tot_bill);
                            int user_bill = sc.nextInt();
                        } else {
                            System.out.println("The Order was Cancelled");
                            break;
                        }
                        int otp = (int) (Math.random() * 9999 + 9999);
                        System.out.println("The OTP was :" + otp);
                        System.out.println("Enter The OTP :");
                        int Otp_user = sc.nextInt();
                        if (otp == Otp_user) {
                            System.out.println("The Order was Placed Successfully");
                        } else {
                            System.out.println("The Order Was Cancelled");
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice");
                        break;
                    }
                }
                break;
            }
            default: {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}


