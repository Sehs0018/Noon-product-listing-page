#Here is to test Search feature speed
  Feature: Search in FBN

    Scenario Outline: Is to test Search with valid sku input

      Given User launch the PLP FBN Tab
      When User search "<sku>"
      Then List is filtered based on "<Test_SKU>"

    #This to test scenario with 3 different values




      Examples:
        | sku          | Test_SKU     |
        | RZ700014200C | RZ700014200C |
        |              |              |
        | RZ700014200C | RZ70001420C  |

    Scenario Outline: Try search scenario in supermall tab
      Given User launch PlP in Supermall tab
      When User searchs "<SKU_exmple>"
      Then List is filtered based on the "<Test_sku>"

      Examples:

        | SKU_exmple | Test_sku |
        |            |          |