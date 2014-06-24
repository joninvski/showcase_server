$ ->
 $.get "/v1/ringtones", (data) ->
    $.each data, (index, ringtone) ->
        ringText = ringtone.name + " ---> " + ringtone.path
        $("#ringtones").append $("<li>").text ringText
