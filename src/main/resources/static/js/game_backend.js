$(document).ready(function (data, status) {

    document.getElementById('rock_be').hidden = false;
    document.getElementById('scissors_be').hidden = false;
    document.getElementById('paper_be').hidden = false;

    $('#rock_be').click(function () {

        $.get('/card/backend/rock_be', function (data) {
            showCardSelect(data.nameCardMy);
            showCardPC(data.nameCardComp, data.status_game);
        });
    });
    $('#paper_be').click(function () {

        $.get('/card/backend/paper_be', function (data) {
            showCardSelect(data.nameCardMy);
            showCardPC(data.nameCardComp, data.status_game);
        });
    });
    $('#scissors_be').click(function () {

        $.get('/card/backend/scissors_be', function (data) {
            showCardSelect(data.nameCardMy);
            showCardPC(data.nameCardComp, data.status_game);
        });
    });
})


function showCardSelect(nameCard) {
    document.getElementById('rock_be').hidden = true;
    document.getElementById('scissors_be').hidden = true;
    document.getElementById('paper_be').hidden = true;
    if (nameCard == "rock_be") {
        document.getElementById('rock_be').hidden = false;
    }
    if (nameCard == "paper_be") {
        document.getElementById('paper_be').hidden = false;
    }
    if (nameCard == "scissors_be") {
        document.getElementById('scissors_be').hidden = false;
    }
}

function showCardPC(nameCardPC, status_game_be) {
    if (nameCardPC == "rock_pc") {
        document.getElementById(nameCardPC).hidden = false;
    }
    if (nameCardPC == "paper_pc") {
        document.getElementById(nameCardPC).hidden = false;
    }
    if (nameCardPC == "scissors_pc") {
        document.getElementById(nameCardPC).hidden = false;
    }

    document.getElementById('status_be').innerHTML = status_game_be;

    setTimeout(function () {
        location.reload();
    }, 2500);
}