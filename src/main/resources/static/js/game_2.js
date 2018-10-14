
$(document).ready(function () {


    //get card

    function getCard(myCard) {

        $.get("/card", function (data, status) {

            // document.getElementById("card").innerHTML = data;
            if (data == "rock") {
                document.getElementById("card_3").hidden = false;
            }
            if (data == "paper") {
                document.getElementById("card_1").hidden = false;
            }
            if (data == "scissors") {
                document.getElementById("card_2").hidden = false;
            }

            var status_vin = 0;

            if (myCard == data) {
                document.getElementById("card_status").innerHTML = myCard + " " + data;

            }

            if (myCard != data) {

                if (myCard == "paper" && data == "rock") {
                    document.getElementById("card_status").innerHTML = "I'am vin";

                    status_vin = true;
                }
                if (myCard == "scissors" && data == "paper") {
                    document.getElementById("card_status").innerHTML = "I'am vin";
                    status_vin = true;
                }
                if (myCard == "rock" && data == "scissors") {
                    document.getElementById("card_status").innerHTML = "I'am vin";
                    status_vin = true;
                }
                if (status_vin == false) {
                    document.getElementById("card_status").innerHTML = "FALL";
                    document.getElementById("card_status").style.color = "red"
                }
            }

        });


    }

    // show card

    document.getElementById("rock").hidden = false;
    document.getElementById("paper").hidden = false;
    document.getElementById("scissors").hidden = false;

    //select card

    $("#rock").click(function () {
        document.getElementById("rock").hidden = false;
        document.getElementById("paper").hidden = true;
        document.getElementById("scissors").hidden = true;
        //add func for hidden

        getCard("rock");
        document.getElementsByTagName("button")[0].click();


    });
    $("#paper").click(function () {
        document.getElementById("rock").hidden = true;
        document.getElementById("paper").hidden = false;
        document.getElementById("scissors").hidden = true;

        getCard("paper")
        document.getElementsByTagName("button")[0].click();

    });
    $("#scissors").click(function () {
        document.getElementById("rock").hidden = true;
        document.getElementById("paper").hidden = true;
        document.getElementById("scissors").hidden = false;

        getCard("scissors")
        document.getElementsByTagName("button")[0].click();


    });



});