Feature: Product Details

    @mao
    Scenario: Add to Cart

        Given the user is on the Linio page
        And the user wait
        When the user click on an product
        And the user click on next image
        And the user click on next image
        #And the user click on next image dependiendo del producto hay mas o menos imagenes. Por esta razon inactive esta
        And the user click on see more
        And the user click on see less
        And the user click on product details
        And the user click on see less2
        And the user click on increase quantity
        And the user wait
        And the user click on number 2
        And the user click on add to cart
        And the user wait

        #Assertions
        Then can see a Message with the text "Tu producto se agregó al carrito"        
    #---------------------------------------------------------------------------------------