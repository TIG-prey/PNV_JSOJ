import { StoreOptions } from "vuex";

export default {
  // 使用命名空间
  namespace: true,
  state: () => ({
    loginUser: {
      userName: "test",
      role: "notLogin",
    },
  }),
  actions: {
    getLoginUser({ commit, state }, payload) {
      // todo 改为远程请求获取登录信息
      commit("updateUser", { userName: payload.userName });
    },
  },
  mutations: {
    updateUser(state, payload) {
      state.loginUser = payload;
    },
  },
} as StoreOptions<any>;
