<template>
	<el-table :data="tableData" style="width: 100%">
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
				<p v-if="scope.row.in_state==0" style="color: #00A854;">正常</p>
				<p v-if="scope.row.in_state==1" style="color: red;">超储</p>
				<p v-if="scope.row.in_state==2" style="color: orange;">缺货</p>
			</template>
		</el-table-column>
		<el-table-column fixed="right" label="操作" width="200">
			<template #default="scope">
				<el-button @click="selectDetail(scope.row)" type="text" size="medium">查看</el-button>
				<el-button @click="updateFormation()" type="text" size="medium">修改</el-button>
				<el-button @click="delFormation(scope.row)" type="text" size="medium">删除</el-button>
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
		name: "inventory",
		data() {
			return {
				tableData: [],
				formData: [],
				formLabelWidth: '120px',
				dialogFormVisible: false,
				blog: false
			}
		},
		methods: {
			selectDetail(row) {
				this.formData = row
				this.dialogFormVisible = true
			},
			delFormation(row) {
				const _this = this
				let id = row.in_id
				console.log(id)
				this.$confirm('是否删除？', '删除', {
					distinguishCancelAndClose: true,
					confirmButtonText: '是',
					cancelButtonText: '否',
					type: "warning"
				}).then(() => {
					this.axios.delete("http://localhost:8089/medical_care_after/inventory/delFormation" + id)
					alert("删除成功")
				}).catch(() => {
					this.$message({
						type: 'error',
						message: '取消删除!'
					});
				});
			},
			updateFormation() {
				const _this = this
				this.axios.put("http://localhost:8089/medical_care_after/inventory/updateFormation", this.tableData)
					.then(function(response) {
						console.log("=================")
						console.log(response.data)
						var form = response.data.data.list
						var row = _this.tableData.filter(i => i.in_id == form.in_id)[0]
						row.in_id = form.in_id
						row.shop_number = form.shop_number
						row.sname = form.sname
						row.SupplierName = form.SupplierName
						row.company = form.company
						row.in_upperlimit = form.in_upperlimit
						row.in_lowerlimit = form.in_lowerlimit
						row.in_quantity = form.in_quantity
						row.in_describe = form.in_describe
						_this.dialogFormVisible2 = false
					}).catch(function(error) {
						console.log(error)
					})
				this.dialogFormVisible = true
			}
		},

		created: function() {
			const _this = this
			this.axios.get("http://localhost:8089/medical_care_after/inventory/selectDetail")
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
