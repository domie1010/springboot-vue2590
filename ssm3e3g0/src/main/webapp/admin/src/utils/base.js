const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm3e3g0/",
            name: "ssm3e3g0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm3e3g0/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院预约挂号系统"
        } 
    }
}
export default base
