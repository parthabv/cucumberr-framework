Feature: Verifying book hotel page

  Scenario Outline: Verifying book hotel module by entering debit card with special request
    #Given user is in OmrbBanch hotel page
    #When user enter "<userName>" and "<password>"
    #Then user should verify after login success message "Welcome Partha"
    #When user search by entering all the fields "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRoom>"and "<noAdult>"
    #Then user should verify after select hotel success message "Select Hotel"
    #When user select the first hotel name and save the hotel name and hotel price
    #And user accept the alert to select hotel
    #Then user should verify "Book Hotel" success message after navigate to book hotel
    #When user add the guest details "<salutation>", "<firstName>", "<lastName>", "<mobile>" and  "<email>"
    #And user add gst details  "<regNo>", "<companyName>" and "<companyAddress>"
    #And user add special request  "<otherReq>"
    And user add the payment details  "<cardType>"
      | card       | cardNumber       | nameOnCard | month | year | cvv |
      | Visa       | 5555555555552222 | Greens     | May   | 2024 | 123 |
      | MasterCard | 5666323243232398 | partha     | March | 2025 | 213 |
      | Amex       | 5666323243232316 | Balu       | June  | 2028 | 223 |
      | Discover   | 5666323243232332 | Raja       | July  | 2030 | 183 |
    Then user should verify after booking hotel success message "Booking is Confirmed" and save the orderId
    And user should verify after booking selected hotel name is present successfully

    #Examples: 
      #| userName                   | password   | state      | city    | roomType                            | checkIn    | checkOut   | noRooms | noAdult | salutation | firstName | lastName | mobile     | email                      | regNo      | companyName            | companyAddress | otherReq | cardType   |
      #| parthasarathyb95@gmail.com | Bvmcp@1802 | Tamil Nadu | Chennai | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-21 | 2024-03-28 | 2-Two   | 1-One   | Mr.        | partha    | sarathy  | 8056051393 | parthasarathyb95@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | lakeview | Debit Card |
