
  Kakao.init('90face11024a4b4399d4ca9435955272');



function kakaoLogin() {
    Kakao.Auth.login({
      success: function (response) {
        Kakao.API.request({
          url: '/v2/user/me',
          success: function (response) {
        	   $.ajax({
                          url: '/join/kakao',
                          type: 'POST',
                          dataType: 'text',
                          data: {
                          kakao_bth: response.kakao_account.birthday, kakao_name: response.kakao_account.profile.nickname, kakao_email: response.kakao_account.email
                          },
                          success: function (result) {
                            console.log(result);
                            if (result === 'true') {
                            } else if (result === 'false') {
                              //계정이 있을 경우 로그인 처리
                              location.replace('/home');
                            }
                          },
                          error: function (error) {

                          }
                        })
          },
          fail: function (error) {
            console.log(error)
          },
        })
      },
      fail: function (error) {
        console.log(error)
      },
    })
  }

function kakaoLogout() {
    if (Kakao.Auth.getAccessToken()) {
      Kakao.API.request({
        url: '/v1/user/unlink',
        success: function (response) {
        	console.log(response)
        },
        fail: function (error) {
          console.log(error)
        },
      })
      Kakao.Auth.setAccessToken(undefined)
    }
  }