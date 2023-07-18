package com.soumik.DS;

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int n =sc.nextInt();
        College [] arr = new College[n];

        for(int i=0; i<n; i++){
            int id=sc.nextInt();
            String name= sc.next();
            int contactNo = sc.nextInt();
            String address = sc.next();
            int pincode=sc.nextInt();
            arr[i] = new College(id,name,contactNo,address,pincode);
        }

        String add = sc.next();

        College ans = findCollegeWithMaxPin(arr);

        College ans1 = searchByCollegeAddress(arr,add);

        if(ans == null){
            System.out.println("");
        }else{
            System.out.println("id-"+ans.getId());
            System.out.println("name-"+ans.getName());
            System.out.println("contactNo-"+ans.getContactNo());
            System.out.println("address-"+ans.getAddress());
            System.out.println("pincode-"+ans.getPincode());
        }

        if(ans1 == null){
            System.out.println("");
        }else{
            System.out.println("id-"+ans1.getId());
            System.out.println("name-"+ans1.getName());
            System.out.println("contactNo-"+ans1.getContactNo());
            System.out.println("address-"+ans1.getAddress());
            System.out.println("pincode-"+ans1.getPincode());
        }

    }

    private static College searchByCollegeAddress(College[] arr, String add) {
        College ans = null;
        for(int i=0; i<arr.length; i++){
            if(arr[i].getAddress().equalsIgnoreCase(add)){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static College findCollegeWithMaxPin(College arr[]){
        int pin = Integer.MIN_VALUE;
        College ans = null;
        for (int i=0; i<arr.length; i++){
            if(pin < arr[i].getPincode()){
                pin = arr[i].getPincode();
                ans = arr[i];
            }
        }
        return ans;
    }



}

class College{
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pincode;

    public College(int id, String name, int contactNo, String address, int pincode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}


