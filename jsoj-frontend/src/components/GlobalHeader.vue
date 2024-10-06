<template>
  <a-row id="globalHeader" style="margin-bottom: 16px" align="center">
    <a-col flex="auto">
      <div>
        <a-menu
          mode="horizontal"
          :selected-keys="selectedKeys"
          @menu-item-click="doMenuClick"
        >
          <!--Logo区域-->
          <a-menu-item
            key="0"
            :style="{ padding: 0, marginRight: '38px' }"
            disabled
          >
            <!--png展示-->
            <div class="title-bar">
              <img class="logo" src="../assets/cubic.png" alt="" />
              <div class="title">Cubic OJ</div>
            </div>
          </a-menu-item>
          <!--路由渲染-->
          <a-menu-item v-for="item in routes" :key="item.path"
            >{{ item.name }}
          </a-menu-item>
        </a-menu>
      </div>
    </a-col>
    <a-col flex="100px">
      <div>{{ store.state.user?.loginUser?.userName ?? "未登录" }}</div>
    </a-col>
  </a-row>
</template>

<script setup lang="ts">
import { routes } from "@/router/routers";
import { useRouter } from "vue-router";
import { ref } from "vue";
import { useStore } from "vuex";

const router = useRouter();
// 默认主页
const selectedKeys = ref(["/"]);
// 路由跳转后，更新选中的菜单项
router.afterEach((to, from, failure) => {
  selectedKeys.value = [to.path];
});
//路由跳转
const doMenuClick = (key: string) => {
  router.push({
    path: key,
  });
};

const store = useStore();
console.log(store.state.user.loginUser);

setTimeout(() => {
  store.dispatch("getLoginUser", {
    userName: "JS",
    role: "admin",
  });
}, 3000);
</script>

<style>
#globalHeader {
  box-sizing: border-box;
  width: 100%;
  padding: 40px;
  background-color: var(--color-neutral-2);
}

#globalHeader .title-bar {
  display: flex;
  align-items: center;
}

.logo {
  height: 48px;
}

.title {
  color: #444;
  margin-left: 16px;
}
</style>
