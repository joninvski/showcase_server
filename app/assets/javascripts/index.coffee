$ ->
 $.get "/bars", (data) ->
    $.each data, (index, ringtone) ->
        $("#ringtones").append $("<li>").text ringtone.name
