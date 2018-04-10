### Sublime-Snippet格式 ###
```
<snippet>
	<!-- 文件后缀名：.sublime-snippet -->
	<!-- 
		${数字编号} 可以得到一个TAB占位符
		${1:default} 可以得到一个默认值 
		按Tab键，光标会根据顺序跳转到相应位置
	-->
	<content><![CDATA[
Hello, ${1:this} is a ${2:snippet}.${3}
]]></content>
	<!-- 可选：快捷键，利用Tab自动补全代码的功能 -->
	<tabTrigger>hello</tabTrigger>
	<!-- 可选：使用范围，不填写代表对所有文件有效。eg:source.css和test.html分别对应不同文件。 -->
	<scope></scope>
	<!-- 可选：在snippet菜单中的显示说明（支持中文）。如果不定义，菜单则显示当前文件的文件名。 -->
	<description>代码片段测试</description>
</snippet>
```

### React ###
+ 快捷键【 component 】描述【 react-component 】
```
import React from 'react';
import styles from './TmpComponent.less';

function TmpComponent() {
  return (
    <div className={styles.normal}>
      Component: TmpComponent
    </div>
  );
}

export default TmpComponent;
```
+ 快捷键【 model 】描述【 react-model 】
```
export default {
  namespace: '',
  state: {

  },
  reducers: {
    updateState(state, {payload}) {
      return {...state, ...payload};
    },
  },
  effects: {
    *test({payload}, {select, put, call}) {

    },
  },
  subscriptions: {
  	setup({ dispatch, history }) {
      return history.listen(({ pathname, search }) => {
        if (pathname === '/') {
          
        }
      });
    },
  },
};
```
+ 快捷键【 route 】描述【 react-route 】
```
import React from 'react';
import { connect } from 'dva';
import styles from './Test.less';

function Test({ dispatch, testManage }) {
  return (
    <div className={styles.normal}>
      Route Component
    </div>
  );
}

export default connect(
	( { testManage } ) => ( { testManage } )
)(Test);
```
+ 快捷键【 model-reducers 】描述【 react-model-reducers 】
```
updateState(state, {payload}) {
  return {...state, ...payload};
},
```
+ 快捷键【 model-effects 】描述【 react-model-effects 】
```
*test({payload}, {select, put, call}) {
},
```
+ 快捷键【 select 】描述【 react-model-select 】
```
const {  } = yield select( ({  }) => );
```
+ 快捷键【 put-inline】描述【 react-model-put-inline 】
```
yield put({ type: '' })
```
+ 快捷键【 put 】描述【 react-model-put 】
```
yield put({
  type: '',
  payload: {
    
  }
})
```
+ 快捷键【 call 】描述【 react-model-call 】
```
const { data } = yield call(fucname, params);
```
+ 快捷键【 dispatch-inline】描述【 react-dispatch-inline 】
```
dispatch({ type: '' });
```
+ 快捷键【 dispatch 】描述【 react-dispatch 】
```
dispatch({
  type: '',
  payload: {
    
  },
});
```

### ANT-UI ###
+ 快捷键【 row 】描述【 antui-row 】
```
<Row>
</Row>
```
+ 快捷键【 col 】描述【 antui-col 】
```
<Col span={12}>
</Col>
```
+ 快捷键【 select 】描述【 antui-select 】
```
<Select value={} onChange={} >
  <Option value="">全部</Option>
  {
    list.map( item => (
      <Option key={item.id}>{ item.text }</Option>
    ))
  }
</Select>
```
+ 快捷键【 confirm 】描述【 antui确认框 】
```
Modal.confirm({
  title: `确认删除选中的条数据？`,
  onOk() {
    
  },
});
```
+ 快捷键【 datepicker 】描述【 antui-时间选择（带控制逻辑） 】
```
const disableStartDate = function(current) {
  const end = getFieldValue('endDateM');
  return current.valueOf() > end.valueOf();
}

const disableEndDate = function(current) {
  const start = getFieldValue('startDateM');
  return current.valueOf() < start.valueOf();
}

<DatePicker style={{ width: '100%' }} allowClear={false} disabledDate={disableStartDate} />
```
