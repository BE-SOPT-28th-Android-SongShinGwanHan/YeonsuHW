package kr.co.sopthomework



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.FragmentFactory
import androidx.recyclerview.widget.RecyclerView
import kr.co.sopthomework.databinding.FragmentFollowListBinding
import kr.co.sopthomework.databinding.NameRepositoryBinding

class FollowListAdapter  : RecyclerView.Adapter<FollowListAdapter.FollowingUserViewHolder>
    (){
    val userList = mutableListOf<FollowUserInfo>()



    class FollowingUserViewHolder(
        private val binding:FragmentFollowListBinding):RecyclerView.ViewHolder(binding.root)
    {
        fun onBind(followUserInfo: FollowUserInfo) {
         binding.username.text = followUserInfo.RepoName
        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowingUserViewHolder {
        val binding = FragmentFollowListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return FollowingUserViewHolder(binding)
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: FollowingUserViewHolder, position: Int) {
       holder.onBind(userList[position])
    }

}
}