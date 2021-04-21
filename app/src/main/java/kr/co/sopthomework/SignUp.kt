package kr.co.sopthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kr.co.sopthomework.databinding.ActivityMainBinding
import kr.co.sopthomework.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)



        SignUpButtonClickEvent()


    }

    private fun SignUpButtonClickEvent() {
        binding.Signupbtn.setOnClickListener {
            val username: String = binding.signname.text.toString()
            val signID: String = binding.signID.text.toString()//값받아와서 유저아이디로 저장하기면
            val signPWD: String = binding.signPWD.text.toString()
            //클릭시에 값을 받아온
            if (signID.isNullOrBlank() || signPWD.isNullOrBlank() || username.isNullOrBlank()) { //유저 아이디 값이 널값이라다
                Toast.makeText(this@SignUp, "빈칸 확!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@SignUp, "로그인 성공!", Toast.LENGTH_SHORT).show()
                Log.d("SignInActivity", signID)
                Log.d("SignInActivity", signPWD)
                val intent = Intent(this@SignUp, SignInActivity::class.java)
                intent.putExtra("userID",signID)
                intent.putExtra("userPWD",signPWD)
                intent.putExtra("userName",username)
                startActivity(intent)
            }
            //show까지해야 사용자에게 보여질 수 있다. 안녕하세요가 찍힌다. binding class쓰기
        }
    }
    override fun onStart() {
        super.onStart()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)

    }
    override fun onResume() {
        super.onResume()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

    override fun onPause() {
        super.onPause()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

    override fun onStop() {
        super.onStop()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

    override fun onDestroy() {
        super.onDestroy()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

}

