<template>
	<el-table :data="tableData" style="width: 100%" max-height="250">
		<el-table-column fixed prop="shop_number" label="商品编码" width="160">
		</el-table-column>
		<el-table-column prop="sname" label="商品名称" width="150">
		</el-table-column>
		<el-table-column prop="company" label="计量单位" width="160">
		</el-table-column>
		<el-table-column prop="in_quantity" label="库存数量" width="160">
		</el-table-column>
		<el-table-column prop="in_describe" label="备注" width="160">
		</el-table-column>
		<el-table-column prop="in_state" label="状态">
			<template v-slot="scope">
				<p v-if="scope.row.in_state==2" style="color: orange;">缺货</p>
			</template>
		</el-table-column>
		<el-table-column fixed="right" label="操作" width="200">
			<template #default="scope">
				<el-button @click="selectDetail(scope.row)" type="text" size="medium">查看</el-button>
			</template>
		</el-table-column>
	</el-table>

	<el-dialog title="商品详细信息" v-model="dialogFormVisible">
		<el-form :data="formData" status-icon label-width="100px" ref="formData" class="demo-ruleForm">
			<el-form-item label="库存id">
				<el-input v-model="formData.in_id" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="商品编码">
				<el-input v-model="formData.shop_number" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="商品名称">
				<el-input v-model="formData.sname" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="供货商名称">
				<el-input v-model="formData.SupplierName" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="计量单位">
				<el-input v-model="formData.company" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="库存上限">
				<el-input v-model="formData.in_upperlimit" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="库存下限">
				<el-input v-model="formData.in_lowerlimit" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="库存数量">
				<el-input v-model="formData.in_quantity" autocomplete="off"></el-input>
			</el-form-item>
			<el-form-item label="备注">
				<el-input v-model="formData.in_describe" autocomplete="off"></el-input>
			</el-form-item>
		</el-form>
		<template #footer>
			<span class="dialog-footer">
				<el-button @click="dialogFormVisible = false">返回</el-button>
			</span>
		</template>
	</el-dialog>
</template>

<script>
	export default {
		name: "lowerlimit",
		data() {
			return {
				tableData: [],
				formData: [],
				formLabelWidth: '120px',
				dialogFormVisible: false,
				blog:false
			}
		},
		methods: {
			selectDetail(row) {
				this.formData = row
				this.dialogFormVisible = true
			}
		},
		created:function () {
			const _this = this
			this.axios.get("http://localhost:8089/medical_care_after/inventory/selectLower")
				.then(function(response) {
					_this.tableData = response.data.data.list
					// _this.formData = response.data.data.list
					console.log(response.data)
				}).catch(function(error) {
					console.log(error)
				})
		}
	}
</script>

<style>

</style>
