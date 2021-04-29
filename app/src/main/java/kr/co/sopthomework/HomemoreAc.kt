package kr.co.sopthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.sopthomework.databinding.ActivityHomeBinding
import kr.co.sopthomework.databinding.FragmentFollowListBinding

class HomemoreAc : AppCompatActivity() {
    lateinit var binding: FragmentFollowListBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = FragmentFollowListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var userID:String = binding.userid.text.toString()
        var userName:String = binding.username.text.toString()
        //이렇게 해서 intent로 넣져있는 값을 넣고 싶었는데 안들어갔음
        var useriD = intent.getStringExtra("userID").toString()
        userName = intent.getStringExtra("userName").toString()

          val followingListFragment = FollowListFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.user_list,followingListFragment)
        transaction.commit()




}
}