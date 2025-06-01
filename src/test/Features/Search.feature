@regression

Feature: Search

#Regression test cases for the search function in "PDP"
#To follow the feasible testcases, open the below link
# https://docs.google.com/spreadsheets/d/1yfc_HLasdK_IIOBjO0uzaV0trjgHbakxeyd1-DX1-Yo/edit?usp=sharing



  Scenario Outline:Test search input data (valid, invalid, empty, on the three tabs)

    #User can pass the tab id to the driver
    #User pass the search value
    #driver compares between the two values

    Given User launch the PLP "<Tab>"
    When User search "<sku>"
    Then List is filtered based on "<Test_SKU>"


    Examples:
      | Tab                                                                         | sku           | Test_SKU      |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=fbn       | EDA003860003I | EDA003860003I |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=fbn       |               |               |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=fbn       | EDA00386000I  |               |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=fbp       | EDA003860003I | EDA003860003I |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=fbp       |               |               |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=fbp       | EDA003860003  |               |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=supermall | EDA003860003I | EDA003860003I |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=supermall |               |               |
      | https://noon-catalog.noon.partners/en/catalog?project=PRJ1455&tab=supermall | EDA00386000I  |               |