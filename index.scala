// Databricks notebook source
// MAGIC
// MAGIC %md-sandbox
// MAGIC
// MAGIC <div style="text-align: center; line-height: 0; padding-top: 9px;">
// MAGIC   <img src="https://databricks.com/wp-content/uploads/2018/03/db-academy-rgb-1200px.png" alt="Databricks Learning" style="width: 600px; height: 163px">
// MAGIC </div>

// COMMAND ----------

// MAGIC %md
// MAGIC # Importing Courseware
// MAGIC
// MAGIC Import a DBC file into your Databricks workspace.
// MAGIC
// MAGIC ## ![star](https://files.training.databricks.com/images/105/logo_spark_tiny.png) Lesson Objectives
// MAGIC - Import a course DBC archive into a Databricks workspace
// MAGIC
// MAGIC ## ![star](https://files.training.databricks.com/images/105/logo_spark_tiny.png) Prerequisites
// MAGIC * Web browser: Please use a <a href="https://docs.azuredatabricks.net/user-guide/supported-browsers.html#supported-browsers" target="_blank">supported browser</a>

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC ## ![star](https://files.training.databricks.com/images/105/logo_spark_tiny.png) Video Tutorial
// MAGIC <script src="https://fast.wistia.com/embed/medias/yq16690btx.jsonp" async></script><script src="https://fast.wistia.com/assets/external/E-v1.js" async></script><div class="wistia_embed wistia_async_yq16690btx" style="height:392px;position:relative;width:640px"><div class="wistia_swatch" style="height:100%;left:0;opacity:0;overflow:hidden;position:absolute;top:0;transition:opacity 200ms;width:100%;"><img src="https://fast.wistia.com/embed/medias/yq16690btx/swatch" style="filter:blur(5px);height:100%;object-fit:contain;width:100%;" alt="" aria-hidden="true" onload="this.parentNode.style.opacity=1;" /></div></div>

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC ## Step 1
// MAGIC - Access your Databricks Workspace
// MAGIC - Click the **Home** icon to navigate to your Home directory
// MAGIC - Select your home folder
// MAGIC   - Ours is **`student@databricks.com`**
// MAGIC - Click on the down error next to your home folder
// MAGIC - This brings up a pop-up menu
// MAGIC - Select **Import**
// MAGIC
// MAGIC
// MAGIC <div><img src="https://files.training.databricks.com/images/platform/import-notebook.png" style="height: 300px; box-shadow: 10px 10px 5px grey;"/></div><br/>

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC ## Step 2
// MAGIC - Selecting **Import** brings up an **Import Notebooks** pop-up window
// MAGIC - In the pop-up window, select the radio button to import from **File**
// MAGIC - Click the browse link and select the DBC file you downloaded previously
// MAGIC
// MAGIC <div><img src="https://files.training.databricks.com/images/platform/import-from-file-browse.png" style="height: 250px; box-shadow: 10px 10px 5px grey;"/></div><br/>

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC ## Step 3
// MAGIC - Clicking the **browse** link will take you to your computer's file browser
// MAGIC   - We are looking for **`Lessons.dbc`**
// MAGIC - Once selected, you will see a green checkmark
// MAGIC - Click **Import**
// MAGIC
// MAGIC <div><img src="https://files.training.databricks.com/images/platform/import-click-button.png" style="height: 300px; box-shadow: 10px 10px 5px grey;"/></div><br/>
// MAGIC
// MAGIC - Wait for the upload to finish
// MAGIC   - This may take a few minutes to complete

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC ## Step 4
// MAGIC - Click the **Home** icon in the left sidebar
// MAGIC - Select your home folder
// MAGIC   - In our example, it is **`student@databricks.com`**
// MAGIC - You should see the appropriate course folder  
// MAGIC   - In our example, the course is called **`Basket-Weaving-101`**
// MAGIC  
// MAGIC
// MAGIC <div><img src="https://files.training.databricks.com/images/platform/aws-databricks-import-course/home-click-basket-weaving-aws.png" style="height: 200px; box-shadow: 10px 10px 5px grey;"/></div><br/>

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC ## Step 5
// MAGIC
// MAGIC - Click on the course folder (**`Basket-Weaving-101`**)
// MAGIC - Clicking on the **`Scala`** (or **`Python`**) sub-folder opens up the notebooks that are part of the course
// MAGIC - Click on the first notebook
// MAGIC   - In our example, it is **`01-Course-Overview-and-Setup`**
// MAGIC
// MAGIC <div><img src="https://files.training.databricks.com/images/platform/aws-databricks-import-course/basket-weaving-aws.png" style="height: 400px; box-shadow: 10px 10px 5px grey;"/></div><br/>

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC
// MAGIC ## Step 6
// MAGIC - Clicking on **`01-Course-Overview-and-Setup`** opens the notebook
// MAGIC - You're ready to start the course
// MAGIC
// MAGIC <div><img src="https://files.training.databricks.com/images/platform/aws-databricks-import-course/basket-weaving-start-page-aws.png" style="height: 400px; box-shadow: 10px 10px 5px grey;"/></div><br/>
// MAGIC

// COMMAND ----------

// MAGIC %md-sandbox
// MAGIC &copy; 2019 Databricks, Inc. All rights reserved.<br/>
// MAGIC Apache, Apache Spark, Spark and the Spark logo are trademarks of the <a href="http://www.apache.org/">Apache Software Foundation</a>.<br/>
// MAGIC <br/>
// MAGIC <a href="https://databricks.com/privacy-policy">Privacy Policy</a> | <a href="https://databricks.com/terms-of-use">Terms of Use</a> | <a href="http://help.databricks.com/">Support</a>
