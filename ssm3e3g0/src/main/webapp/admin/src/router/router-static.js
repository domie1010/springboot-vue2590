import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import guahaotongji from '@/views/modules/guahaotongji/list'
    import yuyueguahao from '@/views/modules/yuyueguahao/list'
    import tousuchuli from '@/views/modules/tousuchuli/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yonghutousu from '@/views/modules/yonghutousu/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import xitongweihu from '@/views/modules/xitongweihu/list'
    import keshifenlei from '@/views/modules/keshifenlei/list'
    import yisheng from '@/views/modules/yisheng/list'
    import keshixinxi from '@/views/modules/keshixinxi/list'
    import xitongshezhi from '@/views/modules/xitongshezhi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/guahaotongji',
        name: '挂号统计',
        component: guahaotongji
      }
      ,{
	path: '/yuyueguahao',
        name: '预约挂号',
        component: yuyueguahao
      }
      ,{
	path: '/tousuchuli',
        name: '投诉处理',
        component: tousuchuli
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yonghutousu',
        name: '用户投诉',
        component: yonghutousu
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/xitongweihu',
        name: '系统维护',
        component: xitongweihu
      }
      ,{
	path: '/keshifenlei',
        name: '科室分类',
        component: keshifenlei
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
      ,{
	path: '/xitongshezhi',
        name: '系统设置',
        component: xitongshezhi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
