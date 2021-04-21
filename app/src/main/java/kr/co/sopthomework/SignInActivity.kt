package kr.co.sopthomework



import android.content.Intent
import android.os.Build.ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kr.co.sopthomework.databinding.ActivityMainBinding
import kr.co.sopthomework.databinding.ActivitySignInBinding
import kr.co.sopthomework.databinding.ActivitySignUpBinding

class SignInActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)




        initButtonClickEvent()
        registerButtion()


    }
    private fun initButtonClickEvent(){
        binding.loginbtn.setOnClickListener{
            val userID:String = binding.loginid.text.toString()//값받아와서 유저아이디로 저장하기면
            val userPWD:String = binding.loginpwd.text.toString()
            val uID = intent.getStringExtra("userID")
            val uPW = intent.getStringExtra("userPWD")

            if(userID.isNotBlank()&& userPWD.isNotBlank()){
                if((uID == userID)&&(uPW == userPWD)){
                    Toast.makeText(this@SignInActivity, "로그인 성공!", Toast.LENGTH_SHORT).show()
                    Log.d("SignInActivity",userID)
                    Log.d("SignInActivity",userPWD)
                    val intent = Intent(this@SignInActivity,HomeActivity::class.java)
                    startActivity(intent)
                }

                else {
                    Toast.makeText(this@SignInActivity, "아이디 비번 확안", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this@SignInActivity, "빈칸 채우기", Toast.LENGTH_SHORT).show()
            }
        }

    }
    private fun registerButtion(){
        binding.registerbtn.setOnClickListener{
            val intent = Intent(this@SignInActivity,SignUp::class.java)
            startActivity(intent)
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
