$ ->
 $.get "/v1/ringtones", (data) ->
    $.each data, (index, ringtone) ->
        ringText = ringtone.name + " ---> " + ringtone.uri + " ---> " + ringtone.price
        $("#ringtones").append $("<li>").text ringText
