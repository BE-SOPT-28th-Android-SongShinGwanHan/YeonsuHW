package kr.co.sopthomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.FragmentFactory
import kr.co.sopthomework.databinding.FragmentFollowListBinding

class FollowListFragment : Fragment() {
    private lateinit var followListAdapter: FollowListAdapter
    private lateinit var binding: FragmentFollowListBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFollowListBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        followListAdapter = FollowListAdapter()
        binding.userList.adapter = followListAdapter

        followListAdapter.userList.addAll(
                listOf<FollowUserInfo>(
                        FollowUserInfo(
                            RepoName = "레포1",
                            RepoExp="1번 레포지토",
                             Lan="파이썬"

                       ),
                        FollowUserInfo(
                            RepoName = "레포2",
                            RepoExp="2번 레포지토",
                            Lan="자바"
                        ),
                        FollowUserInfo(
                            RepoName = "레포3",
                            RepoExp="3번 레포지토",
                            Lan="코틀린"
                        ),
                        FollowUserInfo(
                            RepoName = "레포4",
                            RepoExp="4번 레포지토",
                            Lan="c++"
                        )


                )
        )
        followListAdapter.notifyDataSetChanged()

    }
}