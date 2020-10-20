Feature: Product Details

    @mao
    Scenario: Add to Cart

        Given the user is on the "Linio" page
        And the user wait
        When the user click on "product"
        And the user wait
        And the user click on "next image"
        And the user click on "next image"
        And the user click on "next image"
        And the user click on "see more"
        And the user click on "see less"
        And the user click on "product details"
        And the user click on "see less2"
        And the user ScrollUp
        And the user click on "increase quantity"
        And the user wait
        And the user click on "quantity"
        And the user click on "add to cart"
        And the user wait

        #Assertions
        Then the user can see a message with the text "Tu producto se agregó al carrito" in "message"      
    #---------------------------------------------------------------------------------------