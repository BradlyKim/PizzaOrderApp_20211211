package com.nepplus.pizzaorderapp_20211211.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.pizzaorderapp_20211211.fragments.MyProfileFragment
import com.nepplus.pizzaorderapp_20211211.fragments.PizzaStoreListFragment

class MainViewPagerAdapter( fm: FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2


    override fun getItem(position: Int): Fragment {

        return when(position) {

            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()

        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            
            0 -> "피자 주문"
            else -> "내 정보 설정"            
            
        }
    }
    
}