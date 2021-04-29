package kr.co.sopthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.sopthomework.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var userID:String = binding.userid.text.toString()
        var userName:String = binding.username.text.toString()
        //이렇게 해서 intent로 넣져있는 값을 넣고 싶었는데 안들어갔음
        var useriD = intent.getStringExtra("userID").toString()
        userName = intent.getStringExtra("userName").toString()

        moreButtonClickEvent()

    }

    private fun moreButtonClickEvent() {
        binding.morebtn.setOnClickListener {
            val repoFragment = FollowListFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.user_list, repoFragment)
            transaction.commit()

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